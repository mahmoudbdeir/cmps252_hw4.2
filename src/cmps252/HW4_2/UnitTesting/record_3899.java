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

@Tag("9")
class Record_3899 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3899: FirstName is Jaime")
	void FirstNameOfRecord3899() {
		assertEquals("Jaime", customers.get(3898).getFirstName());
	}

	@Test
	@DisplayName("Record 3899: LastName is Bolser")
	void LastNameOfRecord3899() {
		assertEquals("Bolser", customers.get(3898).getLastName());
	}

	@Test
	@DisplayName("Record 3899: Company is Commission On Human Concerns")
	void CompanyOfRecord3899() {
		assertEquals("Commission On Human Concerns", customers.get(3898).getCompany());
	}

	@Test
	@DisplayName("Record 3899: Address is 3 Embarcadero Ctr")
	void AddressOfRecord3899() {
		assertEquals("3 Embarcadero Ctr", customers.get(3898).getAddress());
	}

	@Test
	@DisplayName("Record 3899: City is San Francisco")
	void CityOfRecord3899() {
		assertEquals("San Francisco", customers.get(3898).getCity());
	}

	@Test
	@DisplayName("Record 3899: County is San Francisco")
	void CountyOfRecord3899() {
		assertEquals("San Francisco", customers.get(3898).getCounty());
	}

	@Test
	@DisplayName("Record 3899: State is CA")
	void StateOfRecord3899() {
		assertEquals("CA", customers.get(3898).getState());
	}

	@Test
	@DisplayName("Record 3899: ZIP is 94111")
	void ZIPOfRecord3899() {
		assertEquals("94111", customers.get(3898).getZIP());
	}

	@Test
	@DisplayName("Record 3899: Phone is 415-393-9061")
	void PhoneOfRecord3899() {
		assertEquals("415-393-9061", customers.get(3898).getPhone());
	}

	@Test
	@DisplayName("Record 3899: Fax is 415-393-3132")
	void FaxOfRecord3899() {
		assertEquals("415-393-3132", customers.get(3898).getFax());
	}

	@Test
	@DisplayName("Record 3899: Email is jaime@bolser.com")
	void EmailOfRecord3899() {
		assertEquals("jaime@bolser.com", customers.get(3898).getEmail());
	}

	@Test
	@DisplayName("Record 3899: Web is http://www.jaimebolser.com")
	void WebOfRecord3899() {
		assertEquals("http://www.jaimebolser.com", customers.get(3898).getWeb());
	}
}
