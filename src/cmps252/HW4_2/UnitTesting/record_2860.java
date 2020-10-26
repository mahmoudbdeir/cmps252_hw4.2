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
class Record_2860 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2860: FirstName is Domingo")
	void FirstNameOfRecord2860() {
		assertEquals("Domingo", customers.get(2859).getFirstName());
	}

	@Test
	@DisplayName("Record 2860: LastName is Cornforth")
	void LastNameOfRecord2860() {
		assertEquals("Cornforth", customers.get(2859).getLastName());
	}

	@Test
	@DisplayName("Record 2860: Company is Curtis, James L Esq")
	void CompanyOfRecord2860() {
		assertEquals("Curtis, James L Esq", customers.get(2859).getCompany());
	}

	@Test
	@DisplayName("Record 2860: Address is 15296 E 14th St")
	void AddressOfRecord2860() {
		assertEquals("15296 E 14th St", customers.get(2859).getAddress());
	}

	@Test
	@DisplayName("Record 2860: City is San Leandro")
	void CityOfRecord2860() {
		assertEquals("San Leandro", customers.get(2859).getCity());
	}

	@Test
	@DisplayName("Record 2860: County is Alameda")
	void CountyOfRecord2860() {
		assertEquals("Alameda", customers.get(2859).getCounty());
	}

	@Test
	@DisplayName("Record 2860: State is CA")
	void StateOfRecord2860() {
		assertEquals("CA", customers.get(2859).getState());
	}

	@Test
	@DisplayName("Record 2860: ZIP is 94578")
	void ZIPOfRecord2860() {
		assertEquals("94578", customers.get(2859).getZIP());
	}

	@Test
	@DisplayName("Record 2860: Phone is 510-278-9105")
	void PhoneOfRecord2860() {
		assertEquals("510-278-9105", customers.get(2859).getPhone());
	}

	@Test
	@DisplayName("Record 2860: Fax is 510-278-8255")
	void FaxOfRecord2860() {
		assertEquals("510-278-8255", customers.get(2859).getFax());
	}

	@Test
	@DisplayName("Record 2860: Email is domingo@cornforth.com")
	void EmailOfRecord2860() {
		assertEquals("domingo@cornforth.com", customers.get(2859).getEmail());
	}

	@Test
	@DisplayName("Record 2860: Web is http://www.domingocornforth.com")
	void WebOfRecord2860() {
		assertEquals("http://www.domingocornforth.com", customers.get(2859).getWeb());
	}
}
