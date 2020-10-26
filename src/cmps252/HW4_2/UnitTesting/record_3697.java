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

@Tag("46")
class Record_3697 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3697: FirstName is Claudia")
	void FirstNameOfRecord3697() {
		assertEquals("Claudia", customers.get(3696).getFirstName());
	}

	@Test
	@DisplayName("Record 3697: LastName is Moralas")
	void LastNameOfRecord3697() {
		assertEquals("Moralas", customers.get(3696).getLastName());
	}

	@Test
	@DisplayName("Record 3697: Company is Eyer, Craig L")
	void CompanyOfRecord3697() {
		assertEquals("Eyer, Craig L", customers.get(3696).getCompany());
	}

	@Test
	@DisplayName("Record 3697: Address is 51 Prospect Pl")
	void AddressOfRecord3697() {
		assertEquals("51 Prospect Pl", customers.get(3696).getAddress());
	}

	@Test
	@DisplayName("Record 3697: City is Hillsdale")
	void CityOfRecord3697() {
		assertEquals("Hillsdale", customers.get(3696).getCity());
	}

	@Test
	@DisplayName("Record 3697: County is Bergen")
	void CountyOfRecord3697() {
		assertEquals("Bergen", customers.get(3696).getCounty());
	}

	@Test
	@DisplayName("Record 3697: State is NJ")
	void StateOfRecord3697() {
		assertEquals("NJ", customers.get(3696).getState());
	}

	@Test
	@DisplayName("Record 3697: ZIP is 7642")
	void ZIPOfRecord3697() {
		assertEquals("7642", customers.get(3696).getZIP());
	}

	@Test
	@DisplayName("Record 3697: Phone is 201-666-3265")
	void PhoneOfRecord3697() {
		assertEquals("201-666-3265", customers.get(3696).getPhone());
	}

	@Test
	@DisplayName("Record 3697: Fax is 201-666-0408")
	void FaxOfRecord3697() {
		assertEquals("201-666-0408", customers.get(3696).getFax());
	}

	@Test
	@DisplayName("Record 3697: Email is claudia@moralas.com")
	void EmailOfRecord3697() {
		assertEquals("claudia@moralas.com", customers.get(3696).getEmail());
	}

	@Test
	@DisplayName("Record 3697: Web is http://www.claudiamoralas.com")
	void WebOfRecord3697() {
		assertEquals("http://www.claudiamoralas.com", customers.get(3696).getWeb());
	}
}
