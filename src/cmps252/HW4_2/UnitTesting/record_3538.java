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

@Tag("25")
class Record_3538 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3538: FirstName is Angelia")
	void FirstNameOfRecord3538() {
		assertEquals("Angelia", customers.get(3537).getFirstName());
	}

	@Test
	@DisplayName("Record 3538: LastName is Munaz")
	void LastNameOfRecord3538() {
		assertEquals("Munaz", customers.get(3537).getLastName());
	}

	@Test
	@DisplayName("Record 3538: Company is P C Products & Services")
	void CompanyOfRecord3538() {
		assertEquals("P C Products & Services", customers.get(3537).getCompany());
	}

	@Test
	@DisplayName("Record 3538: Address is Lancaster Ave")
	void AddressOfRecord3538() {
		assertEquals("Lancaster Ave", customers.get(3537).getAddress());
	}

	@Test
	@DisplayName("Record 3538: City is Wayne")
	void CityOfRecord3538() {
		assertEquals("Wayne", customers.get(3537).getCity());
	}

	@Test
	@DisplayName("Record 3538: County is Delaware")
	void CountyOfRecord3538() {
		assertEquals("Delaware", customers.get(3537).getCounty());
	}

	@Test
	@DisplayName("Record 3538: State is PA")
	void StateOfRecord3538() {
		assertEquals("PA", customers.get(3537).getState());
	}

	@Test
	@DisplayName("Record 3538: ZIP is 19087")
	void ZIPOfRecord3538() {
		assertEquals("19087", customers.get(3537).getZIP());
	}

	@Test
	@DisplayName("Record 3538: Phone is 610-341-5595")
	void PhoneOfRecord3538() {
		assertEquals("610-341-5595", customers.get(3537).getPhone());
	}

	@Test
	@DisplayName("Record 3538: Fax is 610-341-1319")
	void FaxOfRecord3538() {
		assertEquals("610-341-1319", customers.get(3537).getFax());
	}

	@Test
	@DisplayName("Record 3538: Email is angelia@munaz.com")
	void EmailOfRecord3538() {
		assertEquals("angelia@munaz.com", customers.get(3537).getEmail());
	}

	@Test
	@DisplayName("Record 3538: Web is http://www.angeliamunaz.com")
	void WebOfRecord3538() {
		assertEquals("http://www.angeliamunaz.com", customers.get(3537).getWeb());
	}
}
