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

@Tag("14")
class Record_4 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4: FirstName is Gracie")
	void FirstNameOfRecord4() {
		assertEquals("Gracie", customers.get(3).getFirstName());
	}

	@Test
	@DisplayName("Record 4: LastName is Riskalla")
	void LastNameOfRecord4() {
		assertEquals("Riskalla", customers.get(3).getLastName());
	}

	@Test
	@DisplayName("Record 4: Company is Jessup, Richard A Esq")
	void CompanyOfRecord4() {
		assertEquals("Jessup, Richard A Esq", customers.get(3).getCompany());
	}

	@Test
	@DisplayName("Record 4: Address is 5345 Madison Ave")
	void AddressOfRecord4() {
		assertEquals("5345 Madison Ave", customers.get(3).getAddress());
	}

	@Test
	@DisplayName("Record 4: City is Sacramento")
	void CityOfRecord4() {
		assertEquals("Sacramento", customers.get(3).getCity());
	}

	@Test
	@DisplayName("Record 4: County is Sacramento")
	void CountyOfRecord4() {
		assertEquals("Sacramento", customers.get(3).getCounty());
	}

	@Test
	@DisplayName("Record 4: State is CA")
	void StateOfRecord4() {
		assertEquals("CA", customers.get(3).getState());
	}

	@Test
	@DisplayName("Record 4: ZIP is 95841")
	void ZIPOfRecord4() {
		assertEquals("95841", customers.get(3).getZIP());
	}

	@Test
	@DisplayName("Record 4: Phone is 916-344-7735")
	void PhoneOfRecord4() {
		assertEquals("916-344-7735", customers.get(3).getPhone());
	}

	@Test
	@DisplayName("Record 4: Fax is 916-344-8332")
	void FaxOfRecord4() {
		assertEquals("916-344-8332", customers.get(3).getFax());
	}

	@Test
	@DisplayName("Record 4: Email is gracie@riskalla.com")
	void EmailOfRecord4() {
		assertEquals("gracie@riskalla.com", customers.get(3).getEmail());
	}

	@Test
	@DisplayName("Record 4: Web is http://www.gracieriskalla.com")
	void WebOfRecord4() {
		assertEquals("http://www.gracieriskalla.com", customers.get(3).getWeb());
	}
}
