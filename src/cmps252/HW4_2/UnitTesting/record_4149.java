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

@Tag("7")
class Record_4149 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4149: FirstName is Zoe")
	void FirstNameOfRecord4149() {
		assertEquals("Zoe", customers.get(4148).getFirstName());
	}

	@Test
	@DisplayName("Record 4149: LastName is Speakman")
	void LastNameOfRecord4149() {
		assertEquals("Speakman", customers.get(4148).getLastName());
	}

	@Test
	@DisplayName("Record 4149: Company is Auto Europe")
	void CompanyOfRecord4149() {
		assertEquals("Auto Europe", customers.get(4148).getCompany());
	}

	@Test
	@DisplayName("Record 4149: Address is 580 Crespi Dr")
	void AddressOfRecord4149() {
		assertEquals("580 Crespi Dr", customers.get(4148).getAddress());
	}

	@Test
	@DisplayName("Record 4149: City is Pacifica")
	void CityOfRecord4149() {
		assertEquals("Pacifica", customers.get(4148).getCity());
	}

	@Test
	@DisplayName("Record 4149: County is San Mateo")
	void CountyOfRecord4149() {
		assertEquals("San Mateo", customers.get(4148).getCounty());
	}

	@Test
	@DisplayName("Record 4149: State is CA")
	void StateOfRecord4149() {
		assertEquals("CA", customers.get(4148).getState());
	}

	@Test
	@DisplayName("Record 4149: ZIP is 94044")
	void ZIPOfRecord4149() {
		assertEquals("94044", customers.get(4148).getZIP());
	}

	@Test
	@DisplayName("Record 4149: Phone is 650-359-9023")
	void PhoneOfRecord4149() {
		assertEquals("650-359-9023", customers.get(4148).getPhone());
	}

	@Test
	@DisplayName("Record 4149: Fax is 650-359-8679")
	void FaxOfRecord4149() {
		assertEquals("650-359-8679", customers.get(4148).getFax());
	}

	@Test
	@DisplayName("Record 4149: Email is zoe@speakman.com")
	void EmailOfRecord4149() {
		assertEquals("zoe@speakman.com", customers.get(4148).getEmail());
	}

	@Test
	@DisplayName("Record 4149: Web is http://www.zoespeakman.com")
	void WebOfRecord4149() {
		assertEquals("http://www.zoespeakman.com", customers.get(4148).getWeb());
	}
}
