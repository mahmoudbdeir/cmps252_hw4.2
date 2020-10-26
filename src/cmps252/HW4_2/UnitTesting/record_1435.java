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

@Tag("38")
class Record_1435 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1435: FirstName is Isaac")
	void FirstNameOfRecord1435() {
		assertEquals("Isaac", customers.get(1434).getFirstName());
	}

	@Test
	@DisplayName("Record 1435: LastName is Tosto")
	void LastNameOfRecord1435() {
		assertEquals("Tosto", customers.get(1434).getLastName());
	}

	@Test
	@DisplayName("Record 1435: Company is Spina, Patrick J Esq")
	void CompanyOfRecord1435() {
		assertEquals("Spina, Patrick J Esq", customers.get(1434).getCompany());
	}

	@Test
	@DisplayName("Record 1435: Address is 650 Shady Ln")
	void AddressOfRecord1435() {
		assertEquals("650 Shady Ln", customers.get(1434).getAddress());
	}

	@Test
	@DisplayName("Record 1435: City is Fairfield")
	void CityOfRecord1435() {
		assertEquals("Fairfield", customers.get(1434).getCity());
	}

	@Test
	@DisplayName("Record 1435: County is Butler")
	void CountyOfRecord1435() {
		assertEquals("Butler", customers.get(1434).getCounty());
	}

	@Test
	@DisplayName("Record 1435: State is OH")
	void StateOfRecord1435() {
		assertEquals("OH", customers.get(1434).getState());
	}

	@Test
	@DisplayName("Record 1435: ZIP is 45014")
	void ZIPOfRecord1435() {
		assertEquals("45014", customers.get(1434).getZIP());
	}

	@Test
	@DisplayName("Record 1435: Phone is 513-829-2931")
	void PhoneOfRecord1435() {
		assertEquals("513-829-2931", customers.get(1434).getPhone());
	}

	@Test
	@DisplayName("Record 1435: Fax is 513-829-2543")
	void FaxOfRecord1435() {
		assertEquals("513-829-2543", customers.get(1434).getFax());
	}

	@Test
	@DisplayName("Record 1435: Email is isaac@tosto.com")
	void EmailOfRecord1435() {
		assertEquals("isaac@tosto.com", customers.get(1434).getEmail());
	}

	@Test
	@DisplayName("Record 1435: Web is http://www.isaactosto.com")
	void WebOfRecord1435() {
		assertEquals("http://www.isaactosto.com", customers.get(1434).getWeb());
	}
}
