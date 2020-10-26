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

@Tag("1")
class Record_907 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 907: FirstName is Maude")
	void FirstNameOfRecord907() {
		assertEquals("Maude", customers.get(906).getFirstName());
	}

	@Test
	@DisplayName("Record 907: LastName is Chown")
	void LastNameOfRecord907() {
		assertEquals("Chown", customers.get(906).getLastName());
	}

	@Test
	@DisplayName("Record 907: Company is Croffy, Bruce Md")
	void CompanyOfRecord907() {
		assertEquals("Croffy, Bruce Md", customers.get(906).getCompany());
	}

	@Test
	@DisplayName("Record 907: Address is 400 Arthur St")
	void AddressOfRecord907() {
		assertEquals("400 Arthur St", customers.get(906).getAddress());
	}

	@Test
	@DisplayName("Record 907: City is Michigan City")
	void CityOfRecord907() {
		assertEquals("Michigan City", customers.get(906).getCity());
	}

	@Test
	@DisplayName("Record 907: County is La Porte")
	void CountyOfRecord907() {
		assertEquals("La Porte", customers.get(906).getCounty());
	}

	@Test
	@DisplayName("Record 907: State is IN")
	void StateOfRecord907() {
		assertEquals("IN", customers.get(906).getState());
	}

	@Test
	@DisplayName("Record 907: ZIP is 46360")
	void ZIPOfRecord907() {
		assertEquals("46360", customers.get(906).getZIP());
	}

	@Test
	@DisplayName("Record 907: Phone is 219-879-8946")
	void PhoneOfRecord907() {
		assertEquals("219-879-8946", customers.get(906).getPhone());
	}

	@Test
	@DisplayName("Record 907: Fax is 219-879-7382")
	void FaxOfRecord907() {
		assertEquals("219-879-7382", customers.get(906).getFax());
	}

	@Test
	@DisplayName("Record 907: Email is maude@chown.com")
	void EmailOfRecord907() {
		assertEquals("maude@chown.com", customers.get(906).getEmail());
	}

	@Test
	@DisplayName("Record 907: Web is http://www.maudechown.com")
	void WebOfRecord907() {
		assertEquals("http://www.maudechown.com", customers.get(906).getWeb());
	}
}
