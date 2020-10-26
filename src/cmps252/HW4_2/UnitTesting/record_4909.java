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

@Tag("11")
class Record_4909 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4909: FirstName is Taylor")
	void FirstNameOfRecord4909() {
		assertEquals("Taylor", customers.get(4908).getFirstName());
	}

	@Test
	@DisplayName("Record 4909: LastName is Mcaferty")
	void LastNameOfRecord4909() {
		assertEquals("Mcaferty", customers.get(4908).getLastName());
	}

	@Test
	@DisplayName("Record 4909: Company is Ramada Inn At The Windmill")
	void CompanyOfRecord4909() {
		assertEquals("Ramada Inn At The Windmill", customers.get(4908).getCompany());
	}

	@Test
	@DisplayName("Record 4909: Address is 580 Decker Dr")
	void AddressOfRecord4909() {
		assertEquals("580 Decker Dr", customers.get(4908).getAddress());
	}

	@Test
	@DisplayName("Record 4909: City is Irving")
	void CityOfRecord4909() {
		assertEquals("Irving", customers.get(4908).getCity());
	}

	@Test
	@DisplayName("Record 4909: County is Dallas")
	void CountyOfRecord4909() {
		assertEquals("Dallas", customers.get(4908).getCounty());
	}

	@Test
	@DisplayName("Record 4909: State is TX")
	void StateOfRecord4909() {
		assertEquals("TX", customers.get(4908).getState());
	}

	@Test
	@DisplayName("Record 4909: ZIP is 75062")
	void ZIPOfRecord4909() {
		assertEquals("75062", customers.get(4908).getZIP());
	}

	@Test
	@DisplayName("Record 4909: Phone is 972-717-5232")
	void PhoneOfRecord4909() {
		assertEquals("972-717-5232", customers.get(4908).getPhone());
	}

	@Test
	@DisplayName("Record 4909: Fax is 972-717-2494")
	void FaxOfRecord4909() {
		assertEquals("972-717-2494", customers.get(4908).getFax());
	}

	@Test
	@DisplayName("Record 4909: Email is taylor@mcaferty.com")
	void EmailOfRecord4909() {
		assertEquals("taylor@mcaferty.com", customers.get(4908).getEmail());
	}

	@Test
	@DisplayName("Record 4909: Web is http://www.taylormcaferty.com")
	void WebOfRecord4909() {
		assertEquals("http://www.taylormcaferty.com", customers.get(4908).getWeb());
	}
}
