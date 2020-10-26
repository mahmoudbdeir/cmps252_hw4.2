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

@Tag("43")
class Record_2244 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2244: FirstName is Anderson")
	void FirstNameOfRecord2244() {
		assertEquals("Anderson", customers.get(2243).getFirstName());
	}

	@Test
	@DisplayName("Record 2244: LastName is Warchal")
	void LastNameOfRecord2244() {
		assertEquals("Warchal", customers.get(2243).getLastName());
	}

	@Test
	@DisplayName("Record 2244: Company is Tarayao Architects Aia Ltd")
	void CompanyOfRecord2244() {
		assertEquals("Tarayao Architects Aia Ltd", customers.get(2243).getCompany());
	}

	@Test
	@DisplayName("Record 2244: Address is 728 Black Horse Pike")
	void AddressOfRecord2244() {
		assertEquals("728 Black Horse Pike", customers.get(2243).getAddress());
	}

	@Test
	@DisplayName("Record 2244: City is Blackwood")
	void CityOfRecord2244() {
		assertEquals("Blackwood", customers.get(2243).getCity());
	}

	@Test
	@DisplayName("Record 2244: County is Camden")
	void CountyOfRecord2244() {
		assertEquals("Camden", customers.get(2243).getCounty());
	}

	@Test
	@DisplayName("Record 2244: State is NJ")
	void StateOfRecord2244() {
		assertEquals("NJ", customers.get(2243).getState());
	}

	@Test
	@DisplayName("Record 2244: ZIP is 8012")
	void ZIPOfRecord2244() {
		assertEquals("8012", customers.get(2243).getZIP());
	}

	@Test
	@DisplayName("Record 2244: Phone is 856-228-8468")
	void PhoneOfRecord2244() {
		assertEquals("856-228-8468", customers.get(2243).getPhone());
	}

	@Test
	@DisplayName("Record 2244: Fax is 856-228-7721")
	void FaxOfRecord2244() {
		assertEquals("856-228-7721", customers.get(2243).getFax());
	}

	@Test
	@DisplayName("Record 2244: Email is anderson@warchal.com")
	void EmailOfRecord2244() {
		assertEquals("anderson@warchal.com", customers.get(2243).getEmail());
	}

	@Test
	@DisplayName("Record 2244: Web is http://www.andersonwarchal.com")
	void WebOfRecord2244() {
		assertEquals("http://www.andersonwarchal.com", customers.get(2243).getWeb());
	}
}
