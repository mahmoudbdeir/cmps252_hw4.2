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

@Tag("45")
class Record_2640 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2640: FirstName is Dick")
	void FirstNameOfRecord2640() {
		assertEquals("Dick", customers.get(2639).getFirstName());
	}

	@Test
	@DisplayName("Record 2640: LastName is Maul")
	void LastNameOfRecord2640() {
		assertEquals("Maul", customers.get(2639).getLastName());
	}

	@Test
	@DisplayName("Record 2640: Company is Burkes Cafe")
	void CompanyOfRecord2640() {
		assertEquals("Burkes Cafe", customers.get(2639).getCompany());
	}

	@Test
	@DisplayName("Record 2640: Address is 109 Port Jersey Blvd")
	void AddressOfRecord2640() {
		assertEquals("109 Port Jersey Blvd", customers.get(2639).getAddress());
	}

	@Test
	@DisplayName("Record 2640: City is Jersey City")
	void CityOfRecord2640() {
		assertEquals("Jersey City", customers.get(2639).getCity());
	}

	@Test
	@DisplayName("Record 2640: County is Hudson")
	void CountyOfRecord2640() {
		assertEquals("Hudson", customers.get(2639).getCounty());
	}

	@Test
	@DisplayName("Record 2640: State is NJ")
	void StateOfRecord2640() {
		assertEquals("NJ", customers.get(2639).getState());
	}

	@Test
	@DisplayName("Record 2640: ZIP is 7305")
	void ZIPOfRecord2640() {
		assertEquals("7305", customers.get(2639).getZIP());
	}

	@Test
	@DisplayName("Record 2640: Phone is 201-333-2959")
	void PhoneOfRecord2640() {
		assertEquals("201-333-2959", customers.get(2639).getPhone());
	}

	@Test
	@DisplayName("Record 2640: Fax is 201-333-5501")
	void FaxOfRecord2640() {
		assertEquals("201-333-5501", customers.get(2639).getFax());
	}

	@Test
	@DisplayName("Record 2640: Email is dick@maul.com")
	void EmailOfRecord2640() {
		assertEquals("dick@maul.com", customers.get(2639).getEmail());
	}

	@Test
	@DisplayName("Record 2640: Web is http://www.dickmaul.com")
	void WebOfRecord2640() {
		assertEquals("http://www.dickmaul.com", customers.get(2639).getWeb());
	}
}
