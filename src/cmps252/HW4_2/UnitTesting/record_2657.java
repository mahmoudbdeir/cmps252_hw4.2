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

@Tag("27")
class Record_2657 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2657: FirstName is Morgan")
	void FirstNameOfRecord2657() {
		assertEquals("Morgan", customers.get(2656).getFirstName());
	}

	@Test
	@DisplayName("Record 2657: LastName is Papineau")
	void LastNameOfRecord2657() {
		assertEquals("Papineau", customers.get(2656).getLastName());
	}

	@Test
	@DisplayName("Record 2657: Company is Johnson, William A Esq")
	void CompanyOfRecord2657() {
		assertEquals("Johnson, William A Esq", customers.get(2656).getCompany());
	}

	@Test
	@DisplayName("Record 2657: Address is 1915 Market St")
	void AddressOfRecord2657() {
		assertEquals("1915 Market St", customers.get(2656).getAddress());
	}

	@Test
	@DisplayName("Record 2657: City is Camp Hill")
	void CityOfRecord2657() {
		assertEquals("Camp Hill", customers.get(2656).getCity());
	}

	@Test
	@DisplayName("Record 2657: County is Cumberland")
	void CountyOfRecord2657() {
		assertEquals("Cumberland", customers.get(2656).getCounty());
	}

	@Test
	@DisplayName("Record 2657: State is PA")
	void StateOfRecord2657() {
		assertEquals("PA", customers.get(2656).getState());
	}

	@Test
	@DisplayName("Record 2657: ZIP is 17011")
	void ZIPOfRecord2657() {
		assertEquals("17011", customers.get(2656).getZIP());
	}

	@Test
	@DisplayName("Record 2657: Phone is 717-975-8968")
	void PhoneOfRecord2657() {
		assertEquals("717-975-8968", customers.get(2656).getPhone());
	}

	@Test
	@DisplayName("Record 2657: Fax is 717-975-0065")
	void FaxOfRecord2657() {
		assertEquals("717-975-0065", customers.get(2656).getFax());
	}

	@Test
	@DisplayName("Record 2657: Email is morgan@papineau.com")
	void EmailOfRecord2657() {
		assertEquals("morgan@papineau.com", customers.get(2656).getEmail());
	}

	@Test
	@DisplayName("Record 2657: Web is http://www.morganpapineau.com")
	void WebOfRecord2657() {
		assertEquals("http://www.morganpapineau.com", customers.get(2656).getWeb());
	}
}
