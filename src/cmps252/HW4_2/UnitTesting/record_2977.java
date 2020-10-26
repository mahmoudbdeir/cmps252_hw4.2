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
class Record_2977 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2977: FirstName is Sydney")
	void FirstNameOfRecord2977() {
		assertEquals("Sydney", customers.get(2976).getFirstName());
	}

	@Test
	@DisplayName("Record 2977: LastName is Ziesmer")
	void LastNameOfRecord2977() {
		assertEquals("Ziesmer", customers.get(2976).getLastName());
	}

	@Test
	@DisplayName("Record 2977: Company is Johnson, Mark J Esq")
	void CompanyOfRecord2977() {
		assertEquals("Johnson, Mark J Esq", customers.get(2976).getCompany());
	}

	@Test
	@DisplayName("Record 2977: Address is 9259 Racquet Ball Dr")
	void AddressOfRecord2977() {
		assertEquals("9259 Racquet Ball Dr", customers.get(2976).getAddress());
	}

	@Test
	@DisplayName("Record 2977: City is Indianapolis")
	void CityOfRecord2977() {
		assertEquals("Indianapolis", customers.get(2976).getCity());
	}

	@Test
	@DisplayName("Record 2977: County is Marion")
	void CountyOfRecord2977() {
		assertEquals("Marion", customers.get(2976).getCounty());
	}

	@Test
	@DisplayName("Record 2977: State is IN")
	void StateOfRecord2977() {
		assertEquals("IN", customers.get(2976).getState());
	}

	@Test
	@DisplayName("Record 2977: ZIP is 46260")
	void ZIPOfRecord2977() {
		assertEquals("46260", customers.get(2976).getZIP());
	}

	@Test
	@DisplayName("Record 2977: Phone is 317-879-5443")
	void PhoneOfRecord2977() {
		assertEquals("317-879-5443", customers.get(2976).getPhone());
	}

	@Test
	@DisplayName("Record 2977: Fax is 317-879-4144")
	void FaxOfRecord2977() {
		assertEquals("317-879-4144", customers.get(2976).getFax());
	}

	@Test
	@DisplayName("Record 2977: Email is sydney@ziesmer.com")
	void EmailOfRecord2977() {
		assertEquals("sydney@ziesmer.com", customers.get(2976).getEmail());
	}

	@Test
	@DisplayName("Record 2977: Web is http://www.sydneyziesmer.com")
	void WebOfRecord2977() {
		assertEquals("http://www.sydneyziesmer.com", customers.get(2976).getWeb());
	}
}
