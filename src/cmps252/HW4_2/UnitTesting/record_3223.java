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

@Tag("42")
class Record_3223 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3223: FirstName is Noah")
	void FirstNameOfRecord3223() {
		assertEquals("Noah", customers.get(3222).getFirstName());
	}

	@Test
	@DisplayName("Record 3223: LastName is Roark")
	void LastNameOfRecord3223() {
		assertEquals("Roark", customers.get(3222).getLastName());
	}

	@Test
	@DisplayName("Record 3223: Company is Daniels & Gornto")
	void CompanyOfRecord3223() {
		assertEquals("Daniels & Gornto", customers.get(3222).getCompany());
	}

	@Test
	@DisplayName("Record 3223: Address is 1147 Highway 71 S")
	void AddressOfRecord3223() {
		assertEquals("1147 Highway 71 S", customers.get(3222).getAddress());
	}

	@Test
	@DisplayName("Record 3223: City is Mena")
	void CityOfRecord3223() {
		assertEquals("Mena", customers.get(3222).getCity());
	}

	@Test
	@DisplayName("Record 3223: County is Polk")
	void CountyOfRecord3223() {
		assertEquals("Polk", customers.get(3222).getCounty());
	}

	@Test
	@DisplayName("Record 3223: State is AR")
	void StateOfRecord3223() {
		assertEquals("AR", customers.get(3222).getState());
	}

	@Test
	@DisplayName("Record 3223: ZIP is 71953")
	void ZIPOfRecord3223() {
		assertEquals("71953", customers.get(3222).getZIP());
	}

	@Test
	@DisplayName("Record 3223: Phone is 479-394-6085")
	void PhoneOfRecord3223() {
		assertEquals("479-394-6085", customers.get(3222).getPhone());
	}

	@Test
	@DisplayName("Record 3223: Fax is 479-394-8591")
	void FaxOfRecord3223() {
		assertEquals("479-394-8591", customers.get(3222).getFax());
	}

	@Test
	@DisplayName("Record 3223: Email is noah@roark.com")
	void EmailOfRecord3223() {
		assertEquals("noah@roark.com", customers.get(3222).getEmail());
	}

	@Test
	@DisplayName("Record 3223: Web is http://www.noahroark.com")
	void WebOfRecord3223() {
		assertEquals("http://www.noahroark.com", customers.get(3222).getWeb());
	}
}
