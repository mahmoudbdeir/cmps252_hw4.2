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

@Tag("8")
class Record_1217 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1217: FirstName is Blanca")
	void FirstNameOfRecord1217() {
		assertEquals("Blanca", customers.get(1216).getFirstName());
	}

	@Test
	@DisplayName("Record 1217: LastName is Germon")
	void LastNameOfRecord1217() {
		assertEquals("Germon", customers.get(1216).getLastName());
	}

	@Test
	@DisplayName("Record 1217: Company is Blake, William G Esq")
	void CompanyOfRecord1217() {
		assertEquals("Blake, William G Esq", customers.get(1216).getCompany());
	}

	@Test
	@DisplayName("Record 1217: Address is 4544 Mulhauser Rd")
	void AddressOfRecord1217() {
		assertEquals("4544 Mulhauser Rd", customers.get(1216).getAddress());
	}

	@Test
	@DisplayName("Record 1217: City is Hamilton")
	void CityOfRecord1217() {
		assertEquals("Hamilton", customers.get(1216).getCity());
	}

	@Test
	@DisplayName("Record 1217: County is Butler")
	void CountyOfRecord1217() {
		assertEquals("Butler", customers.get(1216).getCounty());
	}

	@Test
	@DisplayName("Record 1217: State is OH")
	void StateOfRecord1217() {
		assertEquals("OH", customers.get(1216).getState());
	}

	@Test
	@DisplayName("Record 1217: ZIP is 45011")
	void ZIPOfRecord1217() {
		assertEquals("45011", customers.get(1216).getZIP());
	}

	@Test
	@DisplayName("Record 1217: Phone is 513-874-1388")
	void PhoneOfRecord1217() {
		assertEquals("513-874-1388", customers.get(1216).getPhone());
	}

	@Test
	@DisplayName("Record 1217: Fax is 513-874-5966")
	void FaxOfRecord1217() {
		assertEquals("513-874-5966", customers.get(1216).getFax());
	}

	@Test
	@DisplayName("Record 1217: Email is blanca@germon.com")
	void EmailOfRecord1217() {
		assertEquals("blanca@germon.com", customers.get(1216).getEmail());
	}

	@Test
	@DisplayName("Record 1217: Web is http://www.blancagermon.com")
	void WebOfRecord1217() {
		assertEquals("http://www.blancagermon.com", customers.get(1216).getWeb());
	}
}
