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

@Tag("16")
class Record_3048 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3048: FirstName is Patricia")
	void FirstNameOfRecord3048() {
		assertEquals("Patricia", customers.get(3047).getFirstName());
	}

	@Test
	@DisplayName("Record 3048: LastName is Styer")
	void LastNameOfRecord3048() {
		assertEquals("Styer", customers.get(3047).getLastName());
	}

	@Test
	@DisplayName("Record 3048: Company is Camp, Dennis D Esq")
	void CompanyOfRecord3048() {
		assertEquals("Camp, Dennis D Esq", customers.get(3047).getCompany());
	}

	@Test
	@DisplayName("Record 3048: Address is 390 Garden Rd")
	void AddressOfRecord3048() {
		assertEquals("390 Garden Rd", customers.get(3047).getAddress());
	}

	@Test
	@DisplayName("Record 3048: City is Colorado Springs")
	void CityOfRecord3048() {
		assertEquals("Colorado Springs", customers.get(3047).getCity());
	}

	@Test
	@DisplayName("Record 3048: County is El Paso")
	void CountyOfRecord3048() {
		assertEquals("El Paso", customers.get(3047).getCounty());
	}

	@Test
	@DisplayName("Record 3048: State is CO")
	void StateOfRecord3048() {
		assertEquals("CO", customers.get(3047).getState());
	}

	@Test
	@DisplayName("Record 3048: ZIP is 80907")
	void ZIPOfRecord3048() {
		assertEquals("80907", customers.get(3047).getZIP());
	}

	@Test
	@DisplayName("Record 3048: Phone is 719-593-6213")
	void PhoneOfRecord3048() {
		assertEquals("719-593-6213", customers.get(3047).getPhone());
	}

	@Test
	@DisplayName("Record 3048: Fax is 719-593-7559")
	void FaxOfRecord3048() {
		assertEquals("719-593-7559", customers.get(3047).getFax());
	}

	@Test
	@DisplayName("Record 3048: Email is patricia@styer.com")
	void EmailOfRecord3048() {
		assertEquals("patricia@styer.com", customers.get(3047).getEmail());
	}

	@Test
	@DisplayName("Record 3048: Web is http://www.patriciastyer.com")
	void WebOfRecord3048() {
		assertEquals("http://www.patriciastyer.com", customers.get(3047).getWeb());
	}
}
