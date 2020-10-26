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

@Tag("36")
class Record_3359 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3359: FirstName is Marion")
	void FirstNameOfRecord3359() {
		assertEquals("Marion", customers.get(3358).getFirstName());
	}

	@Test
	@DisplayName("Record 3359: LastName is Toper")
	void LastNameOfRecord3359() {
		assertEquals("Toper", customers.get(3358).getLastName());
	}

	@Test
	@DisplayName("Record 3359: Company is Fountain Communication")
	void CompanyOfRecord3359() {
		assertEquals("Fountain Communication", customers.get(3358).getCompany());
	}

	@Test
	@DisplayName("Record 3359: Address is 555 W Smith St")
	void AddressOfRecord3359() {
		assertEquals("555 W Smith St", customers.get(3358).getAddress());
	}

	@Test
	@DisplayName("Record 3359: City is Kent")
	void CityOfRecord3359() {
		assertEquals("Kent", customers.get(3358).getCity());
	}

	@Test
	@DisplayName("Record 3359: County is King")
	void CountyOfRecord3359() {
		assertEquals("King", customers.get(3358).getCounty());
	}

	@Test
	@DisplayName("Record 3359: State is WA")
	void StateOfRecord3359() {
		assertEquals("WA", customers.get(3358).getState());
	}

	@Test
	@DisplayName("Record 3359: ZIP is 98032")
	void ZIPOfRecord3359() {
		assertEquals("98032", customers.get(3358).getZIP());
	}

	@Test
	@DisplayName("Record 3359: Phone is 206-852-7071")
	void PhoneOfRecord3359() {
		assertEquals("206-852-7071", customers.get(3358).getPhone());
	}

	@Test
	@DisplayName("Record 3359: Fax is 206-852-9174")
	void FaxOfRecord3359() {
		assertEquals("206-852-9174", customers.get(3358).getFax());
	}

	@Test
	@DisplayName("Record 3359: Email is marion@toper.com")
	void EmailOfRecord3359() {
		assertEquals("marion@toper.com", customers.get(3358).getEmail());
	}

	@Test
	@DisplayName("Record 3359: Web is http://www.mariontoper.com")
	void WebOfRecord3359() {
		assertEquals("http://www.mariontoper.com", customers.get(3358).getWeb());
	}
}
