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

@Tag("8")
class Record_4242 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4242: FirstName is Sid")
	void FirstNameOfRecord4242() {
		assertEquals("Sid", customers.get(4241).getFirstName());
	}

	@Test
	@DisplayName("Record 4242: LastName is Compagna")
	void LastNameOfRecord4242() {
		assertEquals("Compagna", customers.get(4241).getLastName());
	}

	@Test
	@DisplayName("Record 4242: Company is Drive Line Service Of Alaska")
	void CompanyOfRecord4242() {
		assertEquals("Drive Line Service Of Alaska", customers.get(4241).getCompany());
	}

	@Test
	@DisplayName("Record 4242: Address is 844 Nw Bond St")
	void AddressOfRecord4242() {
		assertEquals("844 Nw Bond St", customers.get(4241).getAddress());
	}

	@Test
	@DisplayName("Record 4242: City is Bend")
	void CityOfRecord4242() {
		assertEquals("Bend", customers.get(4241).getCity());
	}

	@Test
	@DisplayName("Record 4242: County is Deschutes")
	void CountyOfRecord4242() {
		assertEquals("Deschutes", customers.get(4241).getCounty());
	}

	@Test
	@DisplayName("Record 4242: State is OR")
	void StateOfRecord4242() {
		assertEquals("OR", customers.get(4241).getState());
	}

	@Test
	@DisplayName("Record 4242: ZIP is 97701")
	void ZIPOfRecord4242() {
		assertEquals("97701", customers.get(4241).getZIP());
	}

	@Test
	@DisplayName("Record 4242: Phone is 541-388-5381")
	void PhoneOfRecord4242() {
		assertEquals("541-388-5381", customers.get(4241).getPhone());
	}

	@Test
	@DisplayName("Record 4242: Fax is 541-388-4574")
	void FaxOfRecord4242() {
		assertEquals("541-388-4574", customers.get(4241).getFax());
	}

	@Test
	@DisplayName("Record 4242: Email is sid@compagna.com")
	void EmailOfRecord4242() {
		assertEquals("sid@compagna.com", customers.get(4241).getEmail());
	}

	@Test
	@DisplayName("Record 4242: Web is http://www.sidcompagna.com")
	void WebOfRecord4242() {
		assertEquals("http://www.sidcompagna.com", customers.get(4241).getWeb());
	}
}
