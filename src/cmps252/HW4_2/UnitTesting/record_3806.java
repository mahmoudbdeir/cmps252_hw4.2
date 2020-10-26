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

@Tag("17")
class Record_3806 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3806: FirstName is Blanca")
	void FirstNameOfRecord3806() {
		assertEquals("Blanca", customers.get(3805).getFirstName());
	}

	@Test
	@DisplayName("Record 3806: LastName is Salmonsen")
	void LastNameOfRecord3806() {
		assertEquals("Salmonsen", customers.get(3805).getLastName());
	}

	@Test
	@DisplayName("Record 3806: Company is Dewolf Marketing Inc")
	void CompanyOfRecord3806() {
		assertEquals("Dewolf Marketing Inc", customers.get(3805).getCompany());
	}

	@Test
	@DisplayName("Record 3806: Address is 3001 W Indian School Rd")
	void AddressOfRecord3806() {
		assertEquals("3001 W Indian School Rd", customers.get(3805).getAddress());
	}

	@Test
	@DisplayName("Record 3806: City is Phoenix")
	void CityOfRecord3806() {
		assertEquals("Phoenix", customers.get(3805).getCity());
	}

	@Test
	@DisplayName("Record 3806: County is Maricopa")
	void CountyOfRecord3806() {
		assertEquals("Maricopa", customers.get(3805).getCounty());
	}

	@Test
	@DisplayName("Record 3806: State is AZ")
	void StateOfRecord3806() {
		assertEquals("AZ", customers.get(3805).getState());
	}

	@Test
	@DisplayName("Record 3806: ZIP is 85017")
	void ZIPOfRecord3806() {
		assertEquals("85017", customers.get(3805).getZIP());
	}

	@Test
	@DisplayName("Record 3806: Phone is 602-222-3966")
	void PhoneOfRecord3806() {
		assertEquals("602-222-3966", customers.get(3805).getPhone());
	}

	@Test
	@DisplayName("Record 3806: Fax is 602-222-4489")
	void FaxOfRecord3806() {
		assertEquals("602-222-4489", customers.get(3805).getFax());
	}

	@Test
	@DisplayName("Record 3806: Email is blanca@salmonsen.com")
	void EmailOfRecord3806() {
		assertEquals("blanca@salmonsen.com", customers.get(3805).getEmail());
	}

	@Test
	@DisplayName("Record 3806: Web is http://www.blancasalmonsen.com")
	void WebOfRecord3806() {
		assertEquals("http://www.blancasalmonsen.com", customers.get(3805).getWeb());
	}
}
