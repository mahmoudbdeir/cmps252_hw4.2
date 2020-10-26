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

@Tag("3")
class Record_843 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 843: FirstName is Arthur")
	void FirstNameOfRecord843() {
		assertEquals("Arthur", customers.get(842).getFirstName());
	}

	@Test
	@DisplayName("Record 843: LastName is Byle")
	void LastNameOfRecord843() {
		assertEquals("Byle", customers.get(842).getLastName());
	}

	@Test
	@DisplayName("Record 843: Company is Kasanow, David Esq")
	void CompanyOfRecord843() {
		assertEquals("Kasanow, David Esq", customers.get(842).getCompany());
	}

	@Test
	@DisplayName("Record 843: Address is 11 N Pearl St")
	void AddressOfRecord843() {
		assertEquals("11 N Pearl St", customers.get(842).getAddress());
	}

	@Test
	@DisplayName("Record 843: City is Albany")
	void CityOfRecord843() {
		assertEquals("Albany", customers.get(842).getCity());
	}

	@Test
	@DisplayName("Record 843: County is Albany")
	void CountyOfRecord843() {
		assertEquals("Albany", customers.get(842).getCounty());
	}

	@Test
	@DisplayName("Record 843: State is NY")
	void StateOfRecord843() {
		assertEquals("NY", customers.get(842).getState());
	}

	@Test
	@DisplayName("Record 843: ZIP is 12207")
	void ZIPOfRecord843() {
		assertEquals("12207", customers.get(842).getZIP());
	}

	@Test
	@DisplayName("Record 843: Phone is 518-436-9127")
	void PhoneOfRecord843() {
		assertEquals("518-436-9127", customers.get(842).getPhone());
	}

	@Test
	@DisplayName("Record 843: Fax is 518-436-8953")
	void FaxOfRecord843() {
		assertEquals("518-436-8953", customers.get(842).getFax());
	}

	@Test
	@DisplayName("Record 843: Email is arthur@byle.com")
	void EmailOfRecord843() {
		assertEquals("arthur@byle.com", customers.get(842).getEmail());
	}

	@Test
	@DisplayName("Record 843: Web is http://www.arthurbyle.com")
	void WebOfRecord843() {
		assertEquals("http://www.arthurbyle.com", customers.get(842).getWeb());
	}
}
