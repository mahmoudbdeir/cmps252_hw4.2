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
class Record_2696 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2696: FirstName is Bobbie")
	void FirstNameOfRecord2696() {
		assertEquals("Bobbie", customers.get(2695).getFirstName());
	}

	@Test
	@DisplayName("Record 2696: LastName is Nordmark")
	void LastNameOfRecord2696() {
		assertEquals("Nordmark", customers.get(2695).getLastName());
	}

	@Test
	@DisplayName("Record 2696: Company is Chamber Commrce Monmouth Area")
	void CompanyOfRecord2696() {
		assertEquals("Chamber Commrce Monmouth Area", customers.get(2695).getCompany());
	}

	@Test
	@DisplayName("Record 2696: Address is 3427 Venice Rd")
	void AddressOfRecord2696() {
		assertEquals("3427 Venice Rd", customers.get(2695).getAddress());
	}

	@Test
	@DisplayName("Record 2696: City is Sandusky")
	void CityOfRecord2696() {
		assertEquals("Sandusky", customers.get(2695).getCity());
	}

	@Test
	@DisplayName("Record 2696: County is Erie")
	void CountyOfRecord2696() {
		assertEquals("Erie", customers.get(2695).getCounty());
	}

	@Test
	@DisplayName("Record 2696: State is OH")
	void StateOfRecord2696() {
		assertEquals("OH", customers.get(2695).getState());
	}

	@Test
	@DisplayName("Record 2696: ZIP is 44870")
	void ZIPOfRecord2696() {
		assertEquals("44870", customers.get(2695).getZIP());
	}

	@Test
	@DisplayName("Record 2696: Phone is 419-626-6124")
	void PhoneOfRecord2696() {
		assertEquals("419-626-6124", customers.get(2695).getPhone());
	}

	@Test
	@DisplayName("Record 2696: Fax is 419-626-1826")
	void FaxOfRecord2696() {
		assertEquals("419-626-1826", customers.get(2695).getFax());
	}

	@Test
	@DisplayName("Record 2696: Email is bobbie@nordmark.com")
	void EmailOfRecord2696() {
		assertEquals("bobbie@nordmark.com", customers.get(2695).getEmail());
	}

	@Test
	@DisplayName("Record 2696: Web is http://www.bobbienordmark.com")
	void WebOfRecord2696() {
		assertEquals("http://www.bobbienordmark.com", customers.get(2695).getWeb());
	}
}
