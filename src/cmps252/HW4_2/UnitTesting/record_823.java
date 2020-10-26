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

@Tag("29")
class Record_823 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 823: FirstName is Kerri")
	void FirstNameOfRecord823() {
		assertEquals("Kerri", customers.get(822).getFirstName());
	}

	@Test
	@DisplayName("Record 823: LastName is Heckendorf")
	void LastNameOfRecord823() {
		assertEquals("Heckendorf", customers.get(822).getLastName());
	}

	@Test
	@DisplayName("Record 823: Company is Chaffey Federal Credit Union")
	void CompanyOfRecord823() {
		assertEquals("Chaffey Federal Credit Union", customers.get(822).getCompany());
	}

	@Test
	@DisplayName("Record 823: Address is 910 N Highland Ave")
	void AddressOfRecord823() {
		assertEquals("910 N Highland Ave", customers.get(822).getAddress());
	}

	@Test
	@DisplayName("Record 823: City is Indianapolis")
	void CityOfRecord823() {
		assertEquals("Indianapolis", customers.get(822).getCity());
	}

	@Test
	@DisplayName("Record 823: County is Marion")
	void CountyOfRecord823() {
		assertEquals("Marion", customers.get(822).getCounty());
	}

	@Test
	@DisplayName("Record 823: State is IN")
	void StateOfRecord823() {
		assertEquals("IN", customers.get(822).getState());
	}

	@Test
	@DisplayName("Record 823: ZIP is 46202")
	void ZIPOfRecord823() {
		assertEquals("46202", customers.get(822).getZIP());
	}

	@Test
	@DisplayName("Record 823: Phone is 317-685-8156")
	void PhoneOfRecord823() {
		assertEquals("317-685-8156", customers.get(822).getPhone());
	}

	@Test
	@DisplayName("Record 823: Fax is 317-685-5028")
	void FaxOfRecord823() {
		assertEquals("317-685-5028", customers.get(822).getFax());
	}

	@Test
	@DisplayName("Record 823: Email is kerri@heckendorf.com")
	void EmailOfRecord823() {
		assertEquals("kerri@heckendorf.com", customers.get(822).getEmail());
	}

	@Test
	@DisplayName("Record 823: Web is http://www.kerriheckendorf.com")
	void WebOfRecord823() {
		assertEquals("http://www.kerriheckendorf.com", customers.get(822).getWeb());
	}
}
