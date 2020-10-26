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

@Tag("23")
class Record_2381 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2381: FirstName is Terrell")
	void FirstNameOfRecord2381() {
		assertEquals("Terrell", customers.get(2380).getFirstName());
	}

	@Test
	@DisplayName("Record 2381: LastName is Apaez")
	void LastNameOfRecord2381() {
		assertEquals("Apaez", customers.get(2380).getLastName());
	}

	@Test
	@DisplayName("Record 2381: Company is Natl Elec Contrs Assn N Ctrl")
	void CompanyOfRecord2381() {
		assertEquals("Natl Elec Contrs Assn N Ctrl", customers.get(2380).getCompany());
	}

	@Test
	@DisplayName("Record 2381: Address is 500 Chestnut St")
	void AddressOfRecord2381() {
		assertEquals("500 Chestnut St", customers.get(2380).getAddress());
	}

	@Test
	@DisplayName("Record 2381: City is Manchester")
	void CityOfRecord2381() {
		assertEquals("Manchester", customers.get(2380).getCity());
	}

	@Test
	@DisplayName("Record 2381: County is Hillsborough")
	void CountyOfRecord2381() {
		assertEquals("Hillsborough", customers.get(2380).getCounty());
	}

	@Test
	@DisplayName("Record 2381: State is NH")
	void StateOfRecord2381() {
		assertEquals("NH", customers.get(2380).getState());
	}

	@Test
	@DisplayName("Record 2381: ZIP is 3101")
	void ZIPOfRecord2381() {
		assertEquals("3101", customers.get(2380).getZIP());
	}

	@Test
	@DisplayName("Record 2381: Phone is 603-627-2168")
	void PhoneOfRecord2381() {
		assertEquals("603-627-2168", customers.get(2380).getPhone());
	}

	@Test
	@DisplayName("Record 2381: Fax is 603-627-8431")
	void FaxOfRecord2381() {
		assertEquals("603-627-8431", customers.get(2380).getFax());
	}

	@Test
	@DisplayName("Record 2381: Email is terrell@apaez.com")
	void EmailOfRecord2381() {
		assertEquals("terrell@apaez.com", customers.get(2380).getEmail());
	}

	@Test
	@DisplayName("Record 2381: Web is http://www.terrellapaez.com")
	void WebOfRecord2381() {
		assertEquals("http://www.terrellapaez.com", customers.get(2380).getWeb());
	}
}
