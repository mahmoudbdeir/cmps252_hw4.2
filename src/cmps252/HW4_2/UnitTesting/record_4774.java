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

@Tag("13")
class Record_4774 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4774: FirstName is Millicent")
	void FirstNameOfRecord4774() {
		assertEquals("Millicent", customers.get(4773).getFirstName());
	}

	@Test
	@DisplayName("Record 4774: LastName is Gendron")
	void LastNameOfRecord4774() {
		assertEquals("Gendron", customers.get(4773).getLastName());
	}

	@Test
	@DisplayName("Record 4774: Company is Arena, Charles J Esq")
	void CompanyOfRecord4774() {
		assertEquals("Arena, Charles J Esq", customers.get(4773).getCompany());
	}

	@Test
	@DisplayName("Record 4774: Address is 2082 Lincoln Ave")
	void AddressOfRecord4774() {
		assertEquals("2082 Lincoln Ave", customers.get(4773).getAddress());
	}

	@Test
	@DisplayName("Record 4774: City is Altadena")
	void CityOfRecord4774() {
		assertEquals("Altadena", customers.get(4773).getCity());
	}

	@Test
	@DisplayName("Record 4774: County is Los Angeles")
	void CountyOfRecord4774() {
		assertEquals("Los Angeles", customers.get(4773).getCounty());
	}

	@Test
	@DisplayName("Record 4774: State is CA")
	void StateOfRecord4774() {
		assertEquals("CA", customers.get(4773).getState());
	}

	@Test
	@DisplayName("Record 4774: ZIP is 91001")
	void ZIPOfRecord4774() {
		assertEquals("91001", customers.get(4773).getZIP());
	}

	@Test
	@DisplayName("Record 4774: Phone is 626-794-7026")
	void PhoneOfRecord4774() {
		assertEquals("626-794-7026", customers.get(4773).getPhone());
	}

	@Test
	@DisplayName("Record 4774: Fax is 626-794-6396")
	void FaxOfRecord4774() {
		assertEquals("626-794-6396", customers.get(4773).getFax());
	}

	@Test
	@DisplayName("Record 4774: Email is millicent@gendron.com")
	void EmailOfRecord4774() {
		assertEquals("millicent@gendron.com", customers.get(4773).getEmail());
	}

	@Test
	@DisplayName("Record 4774: Web is http://www.millicentgendron.com")
	void WebOfRecord4774() {
		assertEquals("http://www.millicentgendron.com", customers.get(4773).getWeb());
	}
}
