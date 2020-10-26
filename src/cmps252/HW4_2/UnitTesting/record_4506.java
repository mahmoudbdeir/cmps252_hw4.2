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

@Tag("36")
class Record_4506 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4506: FirstName is Crystal")
	void FirstNameOfRecord4506() {
		assertEquals("Crystal", customers.get(4505).getFirstName());
	}

	@Test
	@DisplayName("Record 4506: LastName is Lamos")
	void LastNameOfRecord4506() {
		assertEquals("Lamos", customers.get(4505).getLastName());
	}

	@Test
	@DisplayName("Record 4506: Company is Tyler Museum Of Art")
	void CompanyOfRecord4506() {
		assertEquals("Tyler Museum Of Art", customers.get(4505).getCompany());
	}

	@Test
	@DisplayName("Record 4506: Address is 55 Wheeler St")
	void AddressOfRecord4506() {
		assertEquals("55 Wheeler St", customers.get(4505).getAddress());
	}

	@Test
	@DisplayName("Record 4506: City is Cambridge")
	void CityOfRecord4506() {
		assertEquals("Cambridge", customers.get(4505).getCity());
	}

	@Test
	@DisplayName("Record 4506: County is Middlesex")
	void CountyOfRecord4506() {
		assertEquals("Middlesex", customers.get(4505).getCounty());
	}

	@Test
	@DisplayName("Record 4506: State is MA")
	void StateOfRecord4506() {
		assertEquals("MA", customers.get(4505).getState());
	}

	@Test
	@DisplayName("Record 4506: ZIP is 2138")
	void ZIPOfRecord4506() {
		assertEquals("2138", customers.get(4505).getZIP());
	}

	@Test
	@DisplayName("Record 4506: Phone is 617-661-4033")
	void PhoneOfRecord4506() {
		assertEquals("617-661-4033", customers.get(4505).getPhone());
	}

	@Test
	@DisplayName("Record 4506: Fax is 617-661-9784")
	void FaxOfRecord4506() {
		assertEquals("617-661-9784", customers.get(4505).getFax());
	}

	@Test
	@DisplayName("Record 4506: Email is crystal@lamos.com")
	void EmailOfRecord4506() {
		assertEquals("crystal@lamos.com", customers.get(4505).getEmail());
	}

	@Test
	@DisplayName("Record 4506: Web is http://www.crystallamos.com")
	void WebOfRecord4506() {
		assertEquals("http://www.crystallamos.com", customers.get(4505).getWeb());
	}
}
