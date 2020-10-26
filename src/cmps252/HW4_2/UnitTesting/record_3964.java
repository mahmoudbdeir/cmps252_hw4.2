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

@Tag("2")
class Record_3964 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3964: FirstName is Jeanette")
	void FirstNameOfRecord3964() {
		assertEquals("Jeanette", customers.get(3963).getFirstName());
	}

	@Test
	@DisplayName("Record 3964: LastName is Magario")
	void LastNameOfRecord3964() {
		assertEquals("Magario", customers.get(3963).getLastName());
	}

	@Test
	@DisplayName("Record 3964: Company is Quality Carriers Inc")
	void CompanyOfRecord3964() {
		assertEquals("Quality Carriers Inc", customers.get(3963).getCompany());
	}

	@Test
	@DisplayName("Record 3964: Address is 8888 Keystone Xing  #-820")
	void AddressOfRecord3964() {
		assertEquals("8888 Keystone Xing  #-820", customers.get(3963).getAddress());
	}

	@Test
	@DisplayName("Record 3964: City is Indianapolis")
	void CityOfRecord3964() {
		assertEquals("Indianapolis", customers.get(3963).getCity());
	}

	@Test
	@DisplayName("Record 3964: County is Marion")
	void CountyOfRecord3964() {
		assertEquals("Marion", customers.get(3963).getCounty());
	}

	@Test
	@DisplayName("Record 3964: State is IN")
	void StateOfRecord3964() {
		assertEquals("IN", customers.get(3963).getState());
	}

	@Test
	@DisplayName("Record 3964: ZIP is 46240")
	void ZIPOfRecord3964() {
		assertEquals("46240", customers.get(3963).getZIP());
	}

	@Test
	@DisplayName("Record 3964: Phone is 317-574-7079")
	void PhoneOfRecord3964() {
		assertEquals("317-574-7079", customers.get(3963).getPhone());
	}

	@Test
	@DisplayName("Record 3964: Fax is 317-574-2352")
	void FaxOfRecord3964() {
		assertEquals("317-574-2352", customers.get(3963).getFax());
	}

	@Test
	@DisplayName("Record 3964: Email is jeanette@magario.com")
	void EmailOfRecord3964() {
		assertEquals("jeanette@magario.com", customers.get(3963).getEmail());
	}

	@Test
	@DisplayName("Record 3964: Web is http://www.jeanettemagario.com")
	void WebOfRecord3964() {
		assertEquals("http://www.jeanettemagario.com", customers.get(3963).getWeb());
	}
}
