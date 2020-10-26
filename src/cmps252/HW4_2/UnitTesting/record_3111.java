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

@Tag("33")
class Record_3111 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3111: FirstName is Harry")
	void FirstNameOfRecord3111() {
		assertEquals("Harry", customers.get(3110).getFirstName());
	}

	@Test
	@DisplayName("Record 3111: LastName is Esteen")
	void LastNameOfRecord3111() {
		assertEquals("Esteen", customers.get(3110).getLastName());
	}

	@Test
	@DisplayName("Record 3111: Company is Postnet Postal & Business Svc")
	void CompanyOfRecord3111() {
		assertEquals("Postnet Postal & Business Svc", customers.get(3110).getCompany());
	}

	@Test
	@DisplayName("Record 3111: Address is 1450 Stillwater Ave")
	void AddressOfRecord3111() {
		assertEquals("1450 Stillwater Ave", customers.get(3110).getAddress());
	}

	@Test
	@DisplayName("Record 3111: City is Cheyenne")
	void CityOfRecord3111() {
		assertEquals("Cheyenne", customers.get(3110).getCity());
	}

	@Test
	@DisplayName("Record 3111: County is Laramie")
	void CountyOfRecord3111() {
		assertEquals("Laramie", customers.get(3110).getCounty());
	}

	@Test
	@DisplayName("Record 3111: State is WY")
	void StateOfRecord3111() {
		assertEquals("WY", customers.get(3110).getState());
	}

	@Test
	@DisplayName("Record 3111: ZIP is 82009")
	void ZIPOfRecord3111() {
		assertEquals("82009", customers.get(3110).getZIP());
	}

	@Test
	@DisplayName("Record 3111: Phone is 307-634-4051")
	void PhoneOfRecord3111() {
		assertEquals("307-634-4051", customers.get(3110).getPhone());
	}

	@Test
	@DisplayName("Record 3111: Fax is 307-634-6926")
	void FaxOfRecord3111() {
		assertEquals("307-634-6926", customers.get(3110).getFax());
	}

	@Test
	@DisplayName("Record 3111: Email is harry@esteen.com")
	void EmailOfRecord3111() {
		assertEquals("harry@esteen.com", customers.get(3110).getEmail());
	}

	@Test
	@DisplayName("Record 3111: Web is http://www.harryesteen.com")
	void WebOfRecord3111() {
		assertEquals("http://www.harryesteen.com", customers.get(3110).getWeb());
	}
}
