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
class Record_3780 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3780: FirstName is Angelo")
	void FirstNameOfRecord3780() {
		assertEquals("Angelo", customers.get(3779).getFirstName());
	}

	@Test
	@DisplayName("Record 3780: LastName is Hershberg")
	void LastNameOfRecord3780() {
		assertEquals("Hershberg", customers.get(3779).getLastName());
	}

	@Test
	@DisplayName("Record 3780: Company is Siena Auto Sales")
	void CompanyOfRecord3780() {
		assertEquals("Siena Auto Sales", customers.get(3779).getCompany());
	}

	@Test
	@DisplayName("Record 3780: Address is 4064 E North Ave")
	void AddressOfRecord3780() {
		assertEquals("4064 E North Ave", customers.get(3779).getAddress());
	}

	@Test
	@DisplayName("Record 3780: City is Fresno")
	void CityOfRecord3780() {
		assertEquals("Fresno", customers.get(3779).getCity());
	}

	@Test
	@DisplayName("Record 3780: County is Fresno")
	void CountyOfRecord3780() {
		assertEquals("Fresno", customers.get(3779).getCounty());
	}

	@Test
	@DisplayName("Record 3780: State is CA")
	void StateOfRecord3780() {
		assertEquals("CA", customers.get(3779).getState());
	}

	@Test
	@DisplayName("Record 3780: ZIP is 93725")
	void ZIPOfRecord3780() {
		assertEquals("93725", customers.get(3779).getZIP());
	}

	@Test
	@DisplayName("Record 3780: Phone is 559-485-1626")
	void PhoneOfRecord3780() {
		assertEquals("559-485-1626", customers.get(3779).getPhone());
	}

	@Test
	@DisplayName("Record 3780: Fax is 559-485-0629")
	void FaxOfRecord3780() {
		assertEquals("559-485-0629", customers.get(3779).getFax());
	}

	@Test
	@DisplayName("Record 3780: Email is angelo@hershberg.com")
	void EmailOfRecord3780() {
		assertEquals("angelo@hershberg.com", customers.get(3779).getEmail());
	}

	@Test
	@DisplayName("Record 3780: Web is http://www.angelohershberg.com")
	void WebOfRecord3780() {
		assertEquals("http://www.angelohershberg.com", customers.get(3779).getWeb());
	}
}
