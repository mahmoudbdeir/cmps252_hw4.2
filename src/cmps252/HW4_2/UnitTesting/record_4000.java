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
class Record_4000 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4000: FirstName is Ester")
	void FirstNameOfRecord4000() {
		assertEquals("Ester", customers.get(3999).getFirstName());
	}

	@Test
	@DisplayName("Record 4000: LastName is Jourdan")
	void LastNameOfRecord4000() {
		assertEquals("Jourdan", customers.get(3999).getLastName());
	}

	@Test
	@DisplayName("Record 4000: Company is B E Migali Food Svc Equip Inc")
	void CompanyOfRecord4000() {
		assertEquals("B E Migali Food Svc Equip Inc", customers.get(3999).getCompany());
	}

	@Test
	@DisplayName("Record 4000: Address is 8899 Hastings St Ne")
	void AddressOfRecord4000() {
		assertEquals("8899 Hastings St Ne", customers.get(3999).getAddress());
	}

	@Test
	@DisplayName("Record 4000: City is Minneapolis")
	void CityOfRecord4000() {
		assertEquals("Minneapolis", customers.get(3999).getCity());
	}

	@Test
	@DisplayName("Record 4000: County is Anoka")
	void CountyOfRecord4000() {
		assertEquals("Anoka", customers.get(3999).getCounty());
	}

	@Test
	@DisplayName("Record 4000: State is MN")
	void StateOfRecord4000() {
		assertEquals("MN", customers.get(3999).getState());
	}

	@Test
	@DisplayName("Record 4000: ZIP is 55449")
	void ZIPOfRecord4000() {
		assertEquals("55449", customers.get(3999).getZIP());
	}

	@Test
	@DisplayName("Record 4000: Phone is 763-783-3099")
	void PhoneOfRecord4000() {
		assertEquals("763-783-3099", customers.get(3999).getPhone());
	}

	@Test
	@DisplayName("Record 4000: Fax is 763-783-0999")
	void FaxOfRecord4000() {
		assertEquals("763-783-0999", customers.get(3999).getFax());
	}

	@Test
	@DisplayName("Record 4000: Email is ester@jourdan.com")
	void EmailOfRecord4000() {
		assertEquals("ester@jourdan.com", customers.get(3999).getEmail());
	}

	@Test
	@DisplayName("Record 4000: Web is http://www.esterjourdan.com")
	void WebOfRecord4000() {
		assertEquals("http://www.esterjourdan.com", customers.get(3999).getWeb());
	}
}
