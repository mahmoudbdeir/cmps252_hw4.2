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

@Tag("34")
class Record_408 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 408: FirstName is Penelope")
	void FirstNameOfRecord408() {
		assertEquals("Penelope", customers.get(407).getFirstName());
	}

	@Test
	@DisplayName("Record 408: LastName is Graw")
	void LastNameOfRecord408() {
		assertEquals("Graw", customers.get(407).getLastName());
	}

	@Test
	@DisplayName("Record 408: Company is Hodges, Michael L Esq")
	void CompanyOfRecord408() {
		assertEquals("Hodges, Michael L Esq", customers.get(407).getCompany());
	}

	@Test
	@DisplayName("Record 408: Address is 1736 Watt Ave")
	void AddressOfRecord408() {
		assertEquals("1736 Watt Ave", customers.get(407).getAddress());
	}

	@Test
	@DisplayName("Record 408: City is Sacramento")
	void CityOfRecord408() {
		assertEquals("Sacramento", customers.get(407).getCity());
	}

	@Test
	@DisplayName("Record 408: County is Sacramento")
	void CountyOfRecord408() {
		assertEquals("Sacramento", customers.get(407).getCounty());
	}

	@Test
	@DisplayName("Record 408: State is CA")
	void StateOfRecord408() {
		assertEquals("CA", customers.get(407).getState());
	}

	@Test
	@DisplayName("Record 408: ZIP is 95825")
	void ZIPOfRecord408() {
		assertEquals("95825", customers.get(407).getZIP());
	}

	@Test
	@DisplayName("Record 408: Phone is 916-973-6260")
	void PhoneOfRecord408() {
		assertEquals("916-973-6260", customers.get(407).getPhone());
	}

	@Test
	@DisplayName("Record 408: Fax is 916-973-6925")
	void FaxOfRecord408() {
		assertEquals("916-973-6925", customers.get(407).getFax());
	}

	@Test
	@DisplayName("Record 408: Email is penelope@graw.com")
	void EmailOfRecord408() {
		assertEquals("penelope@graw.com", customers.get(407).getEmail());
	}

	@Test
	@DisplayName("Record 408: Web is http://www.penelopegraw.com")
	void WebOfRecord408() {
		assertEquals("http://www.penelopegraw.com", customers.get(407).getWeb());
	}
}
