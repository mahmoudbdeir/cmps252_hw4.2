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
class Record_1497 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1497: FirstName is Paulette")
	void FirstNameOfRecord1497() {
		assertEquals("Paulette", customers.get(1496).getFirstName());
	}

	@Test
	@DisplayName("Record 1497: LastName is Roadruck")
	void LastNameOfRecord1497() {
		assertEquals("Roadruck", customers.get(1496).getLastName());
	}

	@Test
	@DisplayName("Record 1497: Company is Pa Advtsng York Lancaster Div")
	void CompanyOfRecord1497() {
		assertEquals("Pa Advtsng York Lancaster Div", customers.get(1496).getCompany());
	}

	@Test
	@DisplayName("Record 1497: Address is 5731 Palmer Way  #-c")
	void AddressOfRecord1497() {
		assertEquals("5731 Palmer Way  #-c", customers.get(1496).getAddress());
	}

	@Test
	@DisplayName("Record 1497: City is Carlsbad")
	void CityOfRecord1497() {
		assertEquals("Carlsbad", customers.get(1496).getCity());
	}

	@Test
	@DisplayName("Record 1497: County is San Diego")
	void CountyOfRecord1497() {
		assertEquals("San Diego", customers.get(1496).getCounty());
	}

	@Test
	@DisplayName("Record 1497: State is CA")
	void StateOfRecord1497() {
		assertEquals("CA", customers.get(1496).getState());
	}

	@Test
	@DisplayName("Record 1497: ZIP is 92008")
	void ZIPOfRecord1497() {
		assertEquals("92008", customers.get(1496).getZIP());
	}

	@Test
	@DisplayName("Record 1497: Phone is 760-931-7674")
	void PhoneOfRecord1497() {
		assertEquals("760-931-7674", customers.get(1496).getPhone());
	}

	@Test
	@DisplayName("Record 1497: Fax is 760-931-8684")
	void FaxOfRecord1497() {
		assertEquals("760-931-8684", customers.get(1496).getFax());
	}

	@Test
	@DisplayName("Record 1497: Email is paulette@roadruck.com")
	void EmailOfRecord1497() {
		assertEquals("paulette@roadruck.com", customers.get(1496).getEmail());
	}

	@Test
	@DisplayName("Record 1497: Web is http://www.pauletteroadruck.com")
	void WebOfRecord1497() {
		assertEquals("http://www.pauletteroadruck.com", customers.get(1496).getWeb());
	}
}
