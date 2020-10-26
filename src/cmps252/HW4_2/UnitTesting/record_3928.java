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

@Tag("6")
class Record_3928 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3928: FirstName is Athena")
	void FirstNameOfRecord3928() {
		assertEquals("Athena", customers.get(3927).getFirstName());
	}

	@Test
	@DisplayName("Record 3928: LastName is Scinto")
	void LastNameOfRecord3928() {
		assertEquals("Scinto", customers.get(3927).getLastName());
	}

	@Test
	@DisplayName("Record 3928: Company is Budget Services")
	void CompanyOfRecord3928() {
		assertEquals("Budget Services", customers.get(3927).getCompany());
	}

	@Test
	@DisplayName("Record 3928: Address is 43d Rocklyn Ave")
	void AddressOfRecord3928() {
		assertEquals("43d Rocklyn Ave", customers.get(3927).getAddress());
	}

	@Test
	@DisplayName("Record 3928: City is Lynbrook")
	void CityOfRecord3928() {
		assertEquals("Lynbrook", customers.get(3927).getCity());
	}

	@Test
	@DisplayName("Record 3928: County is Nassau")
	void CountyOfRecord3928() {
		assertEquals("Nassau", customers.get(3927).getCounty());
	}

	@Test
	@DisplayName("Record 3928: State is NY")
	void StateOfRecord3928() {
		assertEquals("NY", customers.get(3927).getState());
	}

	@Test
	@DisplayName("Record 3928: ZIP is 11563")
	void ZIPOfRecord3928() {
		assertEquals("11563", customers.get(3927).getZIP());
	}

	@Test
	@DisplayName("Record 3928: Phone is 516-546-9826")
	void PhoneOfRecord3928() {
		assertEquals("516-546-9826", customers.get(3927).getPhone());
	}

	@Test
	@DisplayName("Record 3928: Fax is 516-546-5701")
	void FaxOfRecord3928() {
		assertEquals("516-546-5701", customers.get(3927).getFax());
	}

	@Test
	@DisplayName("Record 3928: Email is athena@scinto.com")
	void EmailOfRecord3928() {
		assertEquals("athena@scinto.com", customers.get(3927).getEmail());
	}

	@Test
	@DisplayName("Record 3928: Web is http://www.athenascinto.com")
	void WebOfRecord3928() {
		assertEquals("http://www.athenascinto.com", customers.get(3927).getWeb());
	}
}
