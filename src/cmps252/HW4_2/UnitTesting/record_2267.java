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

@Tag("30")
class Record_2267 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2267: FirstName is Robbie")
	void FirstNameOfRecord2267() {
		assertEquals("Robbie", customers.get(2266).getFirstName());
	}

	@Test
	@DisplayName("Record 2267: LastName is Pesick")
	void LastNameOfRecord2267() {
		assertEquals("Pesick", customers.get(2266).getLastName());
	}

	@Test
	@DisplayName("Record 2267: Company is Bliss, Deborah Pike Esq")
	void CompanyOfRecord2267() {
		assertEquals("Bliss, Deborah Pike Esq", customers.get(2266).getCompany());
	}

	@Test
	@DisplayName("Record 2267: Address is 2027 W Bullard Ave")
	void AddressOfRecord2267() {
		assertEquals("2027 W Bullard Ave", customers.get(2266).getAddress());
	}

	@Test
	@DisplayName("Record 2267: City is Fresno")
	void CityOfRecord2267() {
		assertEquals("Fresno", customers.get(2266).getCity());
	}

	@Test
	@DisplayName("Record 2267: County is Fresno")
	void CountyOfRecord2267() {
		assertEquals("Fresno", customers.get(2266).getCounty());
	}

	@Test
	@DisplayName("Record 2267: State is CA")
	void StateOfRecord2267() {
		assertEquals("CA", customers.get(2266).getState());
	}

	@Test
	@DisplayName("Record 2267: ZIP is 93711")
	void ZIPOfRecord2267() {
		assertEquals("93711", customers.get(2266).getZIP());
	}

	@Test
	@DisplayName("Record 2267: Phone is 559-431-3468")
	void PhoneOfRecord2267() {
		assertEquals("559-431-3468", customers.get(2266).getPhone());
	}

	@Test
	@DisplayName("Record 2267: Fax is 559-431-2466")
	void FaxOfRecord2267() {
		assertEquals("559-431-2466", customers.get(2266).getFax());
	}

	@Test
	@DisplayName("Record 2267: Email is robbie@pesick.com")
	void EmailOfRecord2267() {
		assertEquals("robbie@pesick.com", customers.get(2266).getEmail());
	}

	@Test
	@DisplayName("Record 2267: Web is http://www.robbiepesick.com")
	void WebOfRecord2267() {
		assertEquals("http://www.robbiepesick.com", customers.get(2266).getWeb());
	}
}
