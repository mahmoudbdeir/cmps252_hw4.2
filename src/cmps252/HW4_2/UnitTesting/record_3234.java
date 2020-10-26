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

@Tag("49")
class Record_3234 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3234: FirstName is Modesto")
	void FirstNameOfRecord3234() {
		assertEquals("Modesto", customers.get(3233).getFirstName());
	}

	@Test
	@DisplayName("Record 3234: LastName is Fugler")
	void LastNameOfRecord3234() {
		assertEquals("Fugler", customers.get(3233).getLastName());
	}

	@Test
	@DisplayName("Record 3234: Company is Krinos Foods Inc")
	void CompanyOfRecord3234() {
		assertEquals("Krinos Foods Inc", customers.get(3233).getCompany());
	}

	@Test
	@DisplayName("Record 3234: Address is 1727 Floradale Ave")
	void AddressOfRecord3234() {
		assertEquals("1727 Floradale Ave", customers.get(3233).getAddress());
	}

	@Test
	@DisplayName("Record 3234: City is South El Monte")
	void CityOfRecord3234() {
		assertEquals("South El Monte", customers.get(3233).getCity());
	}

	@Test
	@DisplayName("Record 3234: County is Los Angeles")
	void CountyOfRecord3234() {
		assertEquals("Los Angeles", customers.get(3233).getCounty());
	}

	@Test
	@DisplayName("Record 3234: State is CA")
	void StateOfRecord3234() {
		assertEquals("CA", customers.get(3233).getState());
	}

	@Test
	@DisplayName("Record 3234: ZIP is 91733")
	void ZIPOfRecord3234() {
		assertEquals("91733", customers.get(3233).getZIP());
	}

	@Test
	@DisplayName("Record 3234: Phone is 626-442-3141")
	void PhoneOfRecord3234() {
		assertEquals("626-442-3141", customers.get(3233).getPhone());
	}

	@Test
	@DisplayName("Record 3234: Fax is 626-442-9536")
	void FaxOfRecord3234() {
		assertEquals("626-442-9536", customers.get(3233).getFax());
	}

	@Test
	@DisplayName("Record 3234: Email is modesto@fugler.com")
	void EmailOfRecord3234() {
		assertEquals("modesto@fugler.com", customers.get(3233).getEmail());
	}

	@Test
	@DisplayName("Record 3234: Web is http://www.modestofugler.com")
	void WebOfRecord3234() {
		assertEquals("http://www.modestofugler.com", customers.get(3233).getWeb());
	}
}
