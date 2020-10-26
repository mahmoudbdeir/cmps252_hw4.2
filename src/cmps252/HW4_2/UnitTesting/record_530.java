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

@Tag("25")
class Record_530 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 530: FirstName is Hosea")
	void FirstNameOfRecord530() {
		assertEquals("Hosea", customers.get(529).getFirstName());
	}

	@Test
	@DisplayName("Record 530: LastName is Fullem")
	void LastNameOfRecord530() {
		assertEquals("Fullem", customers.get(529).getLastName());
	}

	@Test
	@DisplayName("Record 530: Company is Quinn, Terence R Esq")
	void CompanyOfRecord530() {
		assertEquals("Quinn, Terence R Esq", customers.get(529).getCompany());
	}

	@Test
	@DisplayName("Record 530: Address is Box #-854")
	void AddressOfRecord530() {
		assertEquals("Box #-854", customers.get(529).getAddress());
	}

	@Test
	@DisplayName("Record 530: City is Clovis")
	void CityOfRecord530() {
		assertEquals("Clovis", customers.get(529).getCity());
	}

	@Test
	@DisplayName("Record 530: County is Fresno")
	void CountyOfRecord530() {
		assertEquals("Fresno", customers.get(529).getCounty());
	}

	@Test
	@DisplayName("Record 530: State is CA")
	void StateOfRecord530() {
		assertEquals("CA", customers.get(529).getState());
	}

	@Test
	@DisplayName("Record 530: ZIP is 93613")
	void ZIPOfRecord530() {
		assertEquals("93613", customers.get(529).getZIP());
	}

	@Test
	@DisplayName("Record 530: Phone is 559-297-9058")
	void PhoneOfRecord530() {
		assertEquals("559-297-9058", customers.get(529).getPhone());
	}

	@Test
	@DisplayName("Record 530: Fax is 559-297-3456")
	void FaxOfRecord530() {
		assertEquals("559-297-3456", customers.get(529).getFax());
	}

	@Test
	@DisplayName("Record 530: Email is hosea@fullem.com")
	void EmailOfRecord530() {
		assertEquals("hosea@fullem.com", customers.get(529).getEmail());
	}

	@Test
	@DisplayName("Record 530: Web is http://www.hoseafullem.com")
	void WebOfRecord530() {
		assertEquals("http://www.hoseafullem.com", customers.get(529).getWeb());
	}
}
