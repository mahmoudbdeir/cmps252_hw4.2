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

@Tag("27")
class Record_2409 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2409: FirstName is Malcom")
	void FirstNameOfRecord2409() {
		assertEquals("Malcom", customers.get(2408).getFirstName());
	}

	@Test
	@DisplayName("Record 2409: LastName is Ghil")
	void LastNameOfRecord2409() {
		assertEquals("Ghil", customers.get(2408).getLastName());
	}

	@Test
	@DisplayName("Record 2409: Company is Kopy Shop")
	void CompanyOfRecord2409() {
		assertEquals("Kopy Shop", customers.get(2408).getCompany());
	}

	@Test
	@DisplayName("Record 2409: Address is 908 Clove Rd")
	void AddressOfRecord2409() {
		assertEquals("908 Clove Rd", customers.get(2408).getAddress());
	}

	@Test
	@DisplayName("Record 2409: City is Staten Island")
	void CityOfRecord2409() {
		assertEquals("Staten Island", customers.get(2408).getCity());
	}

	@Test
	@DisplayName("Record 2409: County is Richmond")
	void CountyOfRecord2409() {
		assertEquals("Richmond", customers.get(2408).getCounty());
	}

	@Test
	@DisplayName("Record 2409: State is NY")
	void StateOfRecord2409() {
		assertEquals("NY", customers.get(2408).getState());
	}

	@Test
	@DisplayName("Record 2409: ZIP is 10301")
	void ZIPOfRecord2409() {
		assertEquals("10301", customers.get(2408).getZIP());
	}

	@Test
	@DisplayName("Record 2409: Phone is 718-727-5441")
	void PhoneOfRecord2409() {
		assertEquals("718-727-5441", customers.get(2408).getPhone());
	}

	@Test
	@DisplayName("Record 2409: Fax is 718-727-0474")
	void FaxOfRecord2409() {
		assertEquals("718-727-0474", customers.get(2408).getFax());
	}

	@Test
	@DisplayName("Record 2409: Email is malcom@ghil.com")
	void EmailOfRecord2409() {
		assertEquals("malcom@ghil.com", customers.get(2408).getEmail());
	}

	@Test
	@DisplayName("Record 2409: Web is http://www.malcomghil.com")
	void WebOfRecord2409() {
		assertEquals("http://www.malcomghil.com", customers.get(2408).getWeb());
	}
}
