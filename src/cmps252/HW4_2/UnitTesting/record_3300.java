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
class Record_3300 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3300: FirstName is Monika")
	void FirstNameOfRecord3300() {
		assertEquals("Monika", customers.get(3299).getFirstName());
	}

	@Test
	@DisplayName("Record 3300: LastName is Bigusiak")
	void LastNameOfRecord3300() {
		assertEquals("Bigusiak", customers.get(3299).getLastName());
	}

	@Test
	@DisplayName("Record 3300: Company is Wander, Fred B Esq")
	void CompanyOfRecord3300() {
		assertEquals("Wander, Fred B Esq", customers.get(3299).getCompany());
	}

	@Test
	@DisplayName("Record 3300: Address is 1 Sunrise Plz")
	void AddressOfRecord3300() {
		assertEquals("1 Sunrise Plz", customers.get(3299).getAddress());
	}

	@Test
	@DisplayName("Record 3300: City is Valley Stream")
	void CityOfRecord3300() {
		assertEquals("Valley Stream", customers.get(3299).getCity());
	}

	@Test
	@DisplayName("Record 3300: County is Nassau")
	void CountyOfRecord3300() {
		assertEquals("Nassau", customers.get(3299).getCounty());
	}

	@Test
	@DisplayName("Record 3300: State is NY")
	void StateOfRecord3300() {
		assertEquals("NY", customers.get(3299).getState());
	}

	@Test
	@DisplayName("Record 3300: ZIP is 11580")
	void ZIPOfRecord3300() {
		assertEquals("11580", customers.get(3299).getZIP());
	}

	@Test
	@DisplayName("Record 3300: Phone is 516-872-4271")
	void PhoneOfRecord3300() {
		assertEquals("516-872-4271", customers.get(3299).getPhone());
	}

	@Test
	@DisplayName("Record 3300: Fax is 516-872-5763")
	void FaxOfRecord3300() {
		assertEquals("516-872-5763", customers.get(3299).getFax());
	}

	@Test
	@DisplayName("Record 3300: Email is monika@bigusiak.com")
	void EmailOfRecord3300() {
		assertEquals("monika@bigusiak.com", customers.get(3299).getEmail());
	}

	@Test
	@DisplayName("Record 3300: Web is http://www.monikabigusiak.com")
	void WebOfRecord3300() {
		assertEquals("http://www.monikabigusiak.com", customers.get(3299).getWeb());
	}
}
