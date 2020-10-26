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

@Tag("8")
class Record_538 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 538: FirstName is Concepcion")
	void FirstNameOfRecord538() {
		assertEquals("Concepcion", customers.get(537).getFirstName());
	}

	@Test
	@DisplayName("Record 538: LastName is Mainor")
	void LastNameOfRecord538() {
		assertEquals("Mainor", customers.get(537).getLastName());
	}

	@Test
	@DisplayName("Record 538: Company is Nicos Polymers & Grinding Inc")
	void CompanyOfRecord538() {
		assertEquals("Nicos Polymers & Grinding Inc", customers.get(537).getCompany());
	}

	@Test
	@DisplayName("Record 538: Address is 38917 20th St E")
	void AddressOfRecord538() {
		assertEquals("38917 20th St E", customers.get(537).getAddress());
	}

	@Test
	@DisplayName("Record 538: City is Palmdale")
	void CityOfRecord538() {
		assertEquals("Palmdale", customers.get(537).getCity());
	}

	@Test
	@DisplayName("Record 538: County is Los Angeles")
	void CountyOfRecord538() {
		assertEquals("Los Angeles", customers.get(537).getCounty());
	}

	@Test
	@DisplayName("Record 538: State is CA")
	void StateOfRecord538() {
		assertEquals("CA", customers.get(537).getState());
	}

	@Test
	@DisplayName("Record 538: ZIP is 93550")
	void ZIPOfRecord538() {
		assertEquals("93550", customers.get(537).getZIP());
	}

	@Test
	@DisplayName("Record 538: Phone is 661-273-4237")
	void PhoneOfRecord538() {
		assertEquals("661-273-4237", customers.get(537).getPhone());
	}

	@Test
	@DisplayName("Record 538: Fax is 661-273-6554")
	void FaxOfRecord538() {
		assertEquals("661-273-6554", customers.get(537).getFax());
	}

	@Test
	@DisplayName("Record 538: Email is concepcion@mainor.com")
	void EmailOfRecord538() {
		assertEquals("concepcion@mainor.com", customers.get(537).getEmail());
	}

	@Test
	@DisplayName("Record 538: Web is http://www.concepcionmainor.com")
	void WebOfRecord538() {
		assertEquals("http://www.concepcionmainor.com", customers.get(537).getWeb());
	}
}
