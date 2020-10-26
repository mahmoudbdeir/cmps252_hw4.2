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

@Tag("17")
class Record_3226 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3226: FirstName is Florence")
	void FirstNameOfRecord3226() {
		assertEquals("Florence", customers.get(3225).getFirstName());
	}

	@Test
	@DisplayName("Record 3226: LastName is Lapsley")
	void LastNameOfRecord3226() {
		assertEquals("Lapsley", customers.get(3225).getLastName());
	}

	@Test
	@DisplayName("Record 3226: Company is Davey Tree And Lawn Care")
	void CompanyOfRecord3226() {
		assertEquals("Davey Tree And Lawn Care", customers.get(3225).getCompany());
	}

	@Test
	@DisplayName("Record 3226: Address is 2159 Salisbury Park Dr")
	void AddressOfRecord3226() {
		assertEquals("2159 Salisbury Park Dr", customers.get(3225).getAddress());
	}

	@Test
	@DisplayName("Record 3226: City is Westbury")
	void CityOfRecord3226() {
		assertEquals("Westbury", customers.get(3225).getCity());
	}

	@Test
	@DisplayName("Record 3226: County is Nassau")
	void CountyOfRecord3226() {
		assertEquals("Nassau", customers.get(3225).getCounty());
	}

	@Test
	@DisplayName("Record 3226: State is NY")
	void StateOfRecord3226() {
		assertEquals("NY", customers.get(3225).getState());
	}

	@Test
	@DisplayName("Record 3226: ZIP is 11590")
	void ZIPOfRecord3226() {
		assertEquals("11590", customers.get(3225).getZIP());
	}

	@Test
	@DisplayName("Record 3226: Phone is 516-997-4363")
	void PhoneOfRecord3226() {
		assertEquals("516-997-4363", customers.get(3225).getPhone());
	}

	@Test
	@DisplayName("Record 3226: Fax is 516-997-5284")
	void FaxOfRecord3226() {
		assertEquals("516-997-5284", customers.get(3225).getFax());
	}

	@Test
	@DisplayName("Record 3226: Email is florence@lapsley.com")
	void EmailOfRecord3226() {
		assertEquals("florence@lapsley.com", customers.get(3225).getEmail());
	}

	@Test
	@DisplayName("Record 3226: Web is http://www.florencelapsley.com")
	void WebOfRecord3226() {
		assertEquals("http://www.florencelapsley.com", customers.get(3225).getWeb());
	}
}
