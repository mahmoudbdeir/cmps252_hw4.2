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
class Record_3687 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3687: FirstName is Latisha")
	void FirstNameOfRecord3687() {
		assertEquals("Latisha", customers.get(3686).getFirstName());
	}

	@Test
	@DisplayName("Record 3687: LastName is Coufal")
	void LastNameOfRecord3687() {
		assertEquals("Coufal", customers.get(3686).getLastName());
	}

	@Test
	@DisplayName("Record 3687: Company is Geller And Associates Inc")
	void CompanyOfRecord3687() {
		assertEquals("Geller And Associates Inc", customers.get(3686).getCompany());
	}

	@Test
	@DisplayName("Record 3687: Address is 4101 Coon Rapids Blvd Nw")
	void AddressOfRecord3687() {
		assertEquals("4101 Coon Rapids Blvd Nw", customers.get(3686).getAddress());
	}

	@Test
	@DisplayName("Record 3687: City is Minneapolis")
	void CityOfRecord3687() {
		assertEquals("Minneapolis", customers.get(3686).getCity());
	}

	@Test
	@DisplayName("Record 3687: County is Anoka")
	void CountyOfRecord3687() {
		assertEquals("Anoka", customers.get(3686).getCounty());
	}

	@Test
	@DisplayName("Record 3687: State is MN")
	void StateOfRecord3687() {
		assertEquals("MN", customers.get(3686).getState());
	}

	@Test
	@DisplayName("Record 3687: ZIP is 55433")
	void ZIPOfRecord3687() {
		assertEquals("55433", customers.get(3686).getZIP());
	}

	@Test
	@DisplayName("Record 3687: Phone is 763-421-1742")
	void PhoneOfRecord3687() {
		assertEquals("763-421-1742", customers.get(3686).getPhone());
	}

	@Test
	@DisplayName("Record 3687: Fax is 763-421-9575")
	void FaxOfRecord3687() {
		assertEquals("763-421-9575", customers.get(3686).getFax());
	}

	@Test
	@DisplayName("Record 3687: Email is latisha@coufal.com")
	void EmailOfRecord3687() {
		assertEquals("latisha@coufal.com", customers.get(3686).getEmail());
	}

	@Test
	@DisplayName("Record 3687: Web is http://www.latishacoufal.com")
	void WebOfRecord3687() {
		assertEquals("http://www.latishacoufal.com", customers.get(3686).getWeb());
	}
}
