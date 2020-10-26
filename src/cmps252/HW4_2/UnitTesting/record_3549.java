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

@Tag("47")
class Record_3549 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3549: FirstName is Emile")
	void FirstNameOfRecord3549() {
		assertEquals("Emile", customers.get(3548).getFirstName());
	}

	@Test
	@DisplayName("Record 3549: LastName is Uzee")
	void LastNameOfRecord3549() {
		assertEquals("Uzee", customers.get(3548).getLastName());
	}

	@Test
	@DisplayName("Record 3549: Company is Accrt Cmptr Forms Gordon Env")
	void CompanyOfRecord3549() {
		assertEquals("Accrt Cmptr Forms Gordon Env", customers.get(3548).getCompany());
	}

	@Test
	@DisplayName("Record 3549: Address is 747 Chestnut Ridge Rd")
	void AddressOfRecord3549() {
		assertEquals("747 Chestnut Ridge Rd", customers.get(3548).getAddress());
	}

	@Test
	@DisplayName("Record 3549: City is Spring Valley")
	void CityOfRecord3549() {
		assertEquals("Spring Valley", customers.get(3548).getCity());
	}

	@Test
	@DisplayName("Record 3549: County is Rockland")
	void CountyOfRecord3549() {
		assertEquals("Rockland", customers.get(3548).getCounty());
	}

	@Test
	@DisplayName("Record 3549: State is NY")
	void StateOfRecord3549() {
		assertEquals("NY", customers.get(3548).getState());
	}

	@Test
	@DisplayName("Record 3549: ZIP is 10977")
	void ZIPOfRecord3549() {
		assertEquals("10977", customers.get(3548).getZIP());
	}

	@Test
	@DisplayName("Record 3549: Phone is 845-425-2392")
	void PhoneOfRecord3549() {
		assertEquals("845-425-2392", customers.get(3548).getPhone());
	}

	@Test
	@DisplayName("Record 3549: Fax is 845-425-0566")
	void FaxOfRecord3549() {
		assertEquals("845-425-0566", customers.get(3548).getFax());
	}

	@Test
	@DisplayName("Record 3549: Email is emile@uzee.com")
	void EmailOfRecord3549() {
		assertEquals("emile@uzee.com", customers.get(3548).getEmail());
	}

	@Test
	@DisplayName("Record 3549: Web is http://www.emileuzee.com")
	void WebOfRecord3549() {
		assertEquals("http://www.emileuzee.com", customers.get(3548).getWeb());
	}
}
