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

@Tag("41")
class Record_992 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 992: FirstName is Aaron")
	void FirstNameOfRecord992() {
		assertEquals("Aaron", customers.get(991).getFirstName());
	}

	@Test
	@DisplayName("Record 992: LastName is Kieke")
	void LastNameOfRecord992() {
		assertEquals("Kieke", customers.get(991).getLastName());
	}

	@Test
	@DisplayName("Record 992: Company is Firehock, Gregory R Esq")
	void CompanyOfRecord992() {
		assertEquals("Firehock, Gregory R Esq", customers.get(991).getCompany());
	}

	@Test
	@DisplayName("Record 992: Address is 4468 Columbia Rd")
	void AddressOfRecord992() {
		assertEquals("4468 Columbia Rd", customers.get(991).getAddress());
	}

	@Test
	@DisplayName("Record 992: City is Augusta")
	void CityOfRecord992() {
		assertEquals("Augusta", customers.get(991).getCity());
	}

	@Test
	@DisplayName("Record 992: County is Columbia")
	void CountyOfRecord992() {
		assertEquals("Columbia", customers.get(991).getCounty());
	}

	@Test
	@DisplayName("Record 992: State is GA")
	void StateOfRecord992() {
		assertEquals("GA", customers.get(991).getState());
	}

	@Test
	@DisplayName("Record 992: ZIP is 30907")
	void ZIPOfRecord992() {
		assertEquals("30907", customers.get(991).getZIP());
	}

	@Test
	@DisplayName("Record 992: Phone is 706-860-6123")
	void PhoneOfRecord992() {
		assertEquals("706-860-6123", customers.get(991).getPhone());
	}

	@Test
	@DisplayName("Record 992: Fax is 706-860-6122")
	void FaxOfRecord992() {
		assertEquals("706-860-6122", customers.get(991).getFax());
	}

	@Test
	@DisplayName("Record 992: Email is aaron@kieke.com")
	void EmailOfRecord992() {
		assertEquals("aaron@kieke.com", customers.get(991).getEmail());
	}

	@Test
	@DisplayName("Record 992: Web is http://www.aaronkieke.com")
	void WebOfRecord992() {
		assertEquals("http://www.aaronkieke.com", customers.get(991).getWeb());
	}
}
