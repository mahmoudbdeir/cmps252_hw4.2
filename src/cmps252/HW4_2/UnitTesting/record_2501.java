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

@Tag("5")
class Record_2501 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2501: FirstName is Francesca")
	void FirstNameOfRecord2501() {
		assertEquals("Francesca", customers.get(2500).getFirstName());
	}

	@Test
	@DisplayName("Record 2501: LastName is Gusciora")
	void LastNameOfRecord2501() {
		assertEquals("Gusciora", customers.get(2500).getLastName());
	}

	@Test
	@DisplayName("Record 2501: Company is Dunkin, Craig S Esq")
	void CompanyOfRecord2501() {
		assertEquals("Dunkin, Craig S Esq", customers.get(2500).getCompany());
	}

	@Test
	@DisplayName("Record 2501: Address is 310 W Southport Rd")
	void AddressOfRecord2501() {
		assertEquals("310 W Southport Rd", customers.get(2500).getAddress());
	}

	@Test
	@DisplayName("Record 2501: City is Indianapolis")
	void CityOfRecord2501() {
		assertEquals("Indianapolis", customers.get(2500).getCity());
	}

	@Test
	@DisplayName("Record 2501: County is Marion")
	void CountyOfRecord2501() {
		assertEquals("Marion", customers.get(2500).getCounty());
	}

	@Test
	@DisplayName("Record 2501: State is IN")
	void StateOfRecord2501() {
		assertEquals("IN", customers.get(2500).getState());
	}

	@Test
	@DisplayName("Record 2501: ZIP is 46217")
	void ZIPOfRecord2501() {
		assertEquals("46217", customers.get(2500).getZIP());
	}

	@Test
	@DisplayName("Record 2501: Phone is 317-780-8238")
	void PhoneOfRecord2501() {
		assertEquals("317-780-8238", customers.get(2500).getPhone());
	}

	@Test
	@DisplayName("Record 2501: Fax is 317-780-7878")
	void FaxOfRecord2501() {
		assertEquals("317-780-7878", customers.get(2500).getFax());
	}

	@Test
	@DisplayName("Record 2501: Email is francesca@gusciora.com")
	void EmailOfRecord2501() {
		assertEquals("francesca@gusciora.com", customers.get(2500).getEmail());
	}

	@Test
	@DisplayName("Record 2501: Web is http://www.francescagusciora.com")
	void WebOfRecord2501() {
		assertEquals("http://www.francescagusciora.com", customers.get(2500).getWeb());
	}
}
