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

@Tag("18")
class Record_3553 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3553: FirstName is Trinidad")
	void FirstNameOfRecord3553() {
		assertEquals("Trinidad", customers.get(3552).getFirstName());
	}

	@Test
	@DisplayName("Record 3553: LastName is Fromberg")
	void LastNameOfRecord3553() {
		assertEquals("Fromberg", customers.get(3552).getLastName());
	}

	@Test
	@DisplayName("Record 3553: Company is First Assembly Of God Pratt")
	void CompanyOfRecord3553() {
		assertEquals("First Assembly Of God Pratt", customers.get(3552).getCompany());
	}

	@Test
	@DisplayName("Record 3553: Address is 235 Everett Ave")
	void AddressOfRecord3553() {
		assertEquals("235 Everett Ave", customers.get(3552).getAddress());
	}

	@Test
	@DisplayName("Record 3553: City is Wyckoff")
	void CityOfRecord3553() {
		assertEquals("Wyckoff", customers.get(3552).getCity());
	}

	@Test
	@DisplayName("Record 3553: County is Bergen")
	void CountyOfRecord3553() {
		assertEquals("Bergen", customers.get(3552).getCounty());
	}

	@Test
	@DisplayName("Record 3553: State is NJ")
	void StateOfRecord3553() {
		assertEquals("NJ", customers.get(3552).getState());
	}

	@Test
	@DisplayName("Record 3553: ZIP is 7481")
	void ZIPOfRecord3553() {
		assertEquals("7481", customers.get(3552).getZIP());
	}

	@Test
	@DisplayName("Record 3553: Phone is 201-847-0840")
	void PhoneOfRecord3553() {
		assertEquals("201-847-0840", customers.get(3552).getPhone());
	}

	@Test
	@DisplayName("Record 3553: Fax is 201-847-4936")
	void FaxOfRecord3553() {
		assertEquals("201-847-4936", customers.get(3552).getFax());
	}

	@Test
	@DisplayName("Record 3553: Email is trinidad@fromberg.com")
	void EmailOfRecord3553() {
		assertEquals("trinidad@fromberg.com", customers.get(3552).getEmail());
	}

	@Test
	@DisplayName("Record 3553: Web is http://www.trinidadfromberg.com")
	void WebOfRecord3553() {
		assertEquals("http://www.trinidadfromberg.com", customers.get(3552).getWeb());
	}
}
