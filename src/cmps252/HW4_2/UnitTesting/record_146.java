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

@Tag("4")
class Record_146 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 146: FirstName is Agnes")
	void FirstNameOfRecord146() {
		assertEquals("Agnes", customers.get(145).getFirstName());
	}

	@Test
	@DisplayName("Record 146: LastName is Manners")
	void LastNameOfRecord146() {
		assertEquals("Manners", customers.get(145).getLastName());
	}

	@Test
	@DisplayName("Record 146: Company is Gulde, Karen Kroesche Esq")
	void CompanyOfRecord146() {
		assertEquals("Gulde, Karen Kroesche Esq", customers.get(145).getCompany());
	}

	@Test
	@DisplayName("Record 146: Address is 1307 Harrison Ave")
	void AddressOfRecord146() {
		assertEquals("1307 Harrison Ave", customers.get(145).getAddress());
	}

	@Test
	@DisplayName("Record 146: City is Butte")
	void CityOfRecord146() {
		assertEquals("Butte", customers.get(145).getCity());
	}

	@Test
	@DisplayName("Record 146: County is Silver Bow")
	void CountyOfRecord146() {
		assertEquals("Silver Bow", customers.get(145).getCounty());
	}

	@Test
	@DisplayName("Record 146: State is MT")
	void StateOfRecord146() {
		assertEquals("MT", customers.get(145).getState());
	}

	@Test
	@DisplayName("Record 146: ZIP is 59701")
	void ZIPOfRecord146() {
		assertEquals("59701", customers.get(145).getZIP());
	}

	@Test
	@DisplayName("Record 146: Phone is 406-723-8337")
	void PhoneOfRecord146() {
		assertEquals("406-723-8337", customers.get(145).getPhone());
	}

	@Test
	@DisplayName("Record 146: Fax is 406-723-7477")
	void FaxOfRecord146() {
		assertEquals("406-723-7477", customers.get(145).getFax());
	}

	@Test
	@DisplayName("Record 146: Email is agnes@manners.com")
	void EmailOfRecord146() {
		assertEquals("agnes@manners.com", customers.get(145).getEmail());
	}

	@Test
	@DisplayName("Record 146: Web is http://www.agnesmanners.com")
	void WebOfRecord146() {
		assertEquals("http://www.agnesmanners.com", customers.get(145).getWeb());
	}
}
