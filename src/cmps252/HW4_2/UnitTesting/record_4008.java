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

@Tag("13")
class Record_4008 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4008: FirstName is Reba")
	void FirstNameOfRecord4008() {
		assertEquals("Reba", customers.get(4007).getFirstName());
	}

	@Test
	@DisplayName("Record 4008: LastName is Delafontaine")
	void LastNameOfRecord4008() {
		assertEquals("Delafontaine", customers.get(4007).getLastName());
	}

	@Test
	@DisplayName("Record 4008: Company is Bens Discount Liquors")
	void CompanyOfRecord4008() {
		assertEquals("Bens Discount Liquors", customers.get(4007).getCompany());
	}

	@Test
	@DisplayName("Record 4008: Address is 320 Ne 14th St")
	void AddressOfRecord4008() {
		assertEquals("320 Ne 14th St", customers.get(4007).getAddress());
	}

	@Test
	@DisplayName("Record 4008: City is Abilene")
	void CityOfRecord4008() {
		assertEquals("Abilene", customers.get(4007).getCity());
	}

	@Test
	@DisplayName("Record 4008: County is Dickinson")
	void CountyOfRecord4008() {
		assertEquals("Dickinson", customers.get(4007).getCounty());
	}

	@Test
	@DisplayName("Record 4008: State is KS")
	void StateOfRecord4008() {
		assertEquals("KS", customers.get(4007).getState());
	}

	@Test
	@DisplayName("Record 4008: ZIP is 67410")
	void ZIPOfRecord4008() {
		assertEquals("67410", customers.get(4007).getZIP());
	}

	@Test
	@DisplayName("Record 4008: Phone is 785-263-1797")
	void PhoneOfRecord4008() {
		assertEquals("785-263-1797", customers.get(4007).getPhone());
	}

	@Test
	@DisplayName("Record 4008: Fax is 785-263-1542")
	void FaxOfRecord4008() {
		assertEquals("785-263-1542", customers.get(4007).getFax());
	}

	@Test
	@DisplayName("Record 4008: Email is reba@delafontaine.com")
	void EmailOfRecord4008() {
		assertEquals("reba@delafontaine.com", customers.get(4007).getEmail());
	}

	@Test
	@DisplayName("Record 4008: Web is http://www.rebadelafontaine.com")
	void WebOfRecord4008() {
		assertEquals("http://www.rebadelafontaine.com", customers.get(4007).getWeb());
	}
}
