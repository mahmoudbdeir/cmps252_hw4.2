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

@Tag("21")
class Record_358 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 358: FirstName is Russ")
	void FirstNameOfRecord358() {
		assertEquals("Russ", customers.get(357).getFirstName());
	}

	@Test
	@DisplayName("Record 358: LastName is Pretser")
	void LastNameOfRecord358() {
		assertEquals("Pretser", customers.get(357).getLastName());
	}

	@Test
	@DisplayName("Record 358: Company is Novacheck, Ann M Esq")
	void CompanyOfRecord358() {
		assertEquals("Novacheck, Ann M Esq", customers.get(357).getCompany());
	}

	@Test
	@DisplayName("Record 358: Address is 2323 W 5th St")
	void AddressOfRecord358() {
		assertEquals("2323 W 5th St", customers.get(357).getAddress());
	}

	@Test
	@DisplayName("Record 358: City is Santa Ana")
	void CityOfRecord358() {
		assertEquals("Santa Ana", customers.get(357).getCity());
	}

	@Test
	@DisplayName("Record 358: County is Orange")
	void CountyOfRecord358() {
		assertEquals("Orange", customers.get(357).getCounty());
	}

	@Test
	@DisplayName("Record 358: State is CA")
	void StateOfRecord358() {
		assertEquals("CA", customers.get(357).getState());
	}

	@Test
	@DisplayName("Record 358: ZIP is 92703")
	void ZIPOfRecord358() {
		assertEquals("92703", customers.get(357).getZIP());
	}

	@Test
	@DisplayName("Record 358: Phone is 714-542-4334")
	void PhoneOfRecord358() {
		assertEquals("714-542-4334", customers.get(357).getPhone());
	}

	@Test
	@DisplayName("Record 358: Fax is 714-542-3648")
	void FaxOfRecord358() {
		assertEquals("714-542-3648", customers.get(357).getFax());
	}

	@Test
	@DisplayName("Record 358: Email is russ@pretser.com")
	void EmailOfRecord358() {
		assertEquals("russ@pretser.com", customers.get(357).getEmail());
	}

	@Test
	@DisplayName("Record 358: Web is http://www.russpretser.com")
	void WebOfRecord358() {
		assertEquals("http://www.russpretser.com", customers.get(357).getWeb());
	}
}
