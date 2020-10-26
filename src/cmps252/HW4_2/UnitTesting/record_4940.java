package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("10")
class Record_4940 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4940: FirstName is Ellie")
	void FirstNameOfRecord4940() {
		assertEquals("Ellie", customers.get(4939).getFirstName());
	}

	@Test
	@DisplayName("Record 4940: LastName is Direnzo")
	void LastNameOfRecord4940() {
		assertEquals("Direnzo", customers.get(4939).getLastName());
	}

	@Test
	@DisplayName("Record 4940: Company is Franklin 1st Financial Corp")
	void CompanyOfRecord4940() {
		assertEquals("Franklin 1st Financial Corp", customers.get(4939).getCompany());
	}

	@Test
	@DisplayName("Record 4940: Address is 50 S Main St")
	void AddressOfRecord4940() {
		assertEquals("50 S Main St", customers.get(4939).getAddress());
	}

	@Test
	@DisplayName("Record 4940: City is Salt Lake City")
	void CityOfRecord4940() {
		assertEquals("Salt Lake City", customers.get(4939).getCity());
	}

	@Test
	@DisplayName("Record 4940: County is Salt Lake")
	void CountyOfRecord4940() {
		assertEquals("Salt Lake", customers.get(4939).getCounty());
	}

	@Test
	@DisplayName("Record 4940: State is UT")
	void StateOfRecord4940() {
		assertEquals("UT", customers.get(4939).getState());
	}

	@Test
	@DisplayName("Record 4940: ZIP is 84144")
	void ZIPOfRecord4940() {
		assertEquals("84144", customers.get(4939).getZIP());
	}

	@Test
	@DisplayName("Record 4940: Phone is 801-533-6606")
	void PhoneOfRecord4940() {
		assertEquals("801-533-6606", customers.get(4939).getPhone());
	}

	@Test
	@DisplayName("Record 4940: Fax is 801-533-2751")
	void FaxOfRecord4940() {
		assertEquals("801-533-2751", customers.get(4939).getFax());
	}

	@Test
	@DisplayName("Record 4940: Email is ellie@direnzo.com")
	void EmailOfRecord4940() {
		assertEquals("ellie@direnzo.com", customers.get(4939).getEmail());
	}

	@Test
	@DisplayName("Record 4940: Web is http://www.elliedirenzo.com")
	void WebOfRecord4940() {
		assertEquals("http://www.elliedirenzo.com", customers.get(4939).getWeb());
	}
}
