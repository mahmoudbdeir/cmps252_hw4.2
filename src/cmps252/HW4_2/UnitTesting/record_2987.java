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

@Tag("24")
class Record_2987 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2987: FirstName is Lizzie")
	void FirstNameOfRecord2987() {
		assertEquals("Lizzie", customers.get(2986).getFirstName());
	}

	@Test
	@DisplayName("Record 2987: LastName is Hilser")
	void LastNameOfRecord2987() {
		assertEquals("Hilser", customers.get(2986).getLastName());
	}

	@Test
	@DisplayName("Record 2987: Company is Bracewell & Patterson Llp")
	void CompanyOfRecord2987() {
		assertEquals("Bracewell & Patterson Llp", customers.get(2986).getCompany());
	}

	@Test
	@DisplayName("Record 2987: Address is 3750 Guion Rd")
	void AddressOfRecord2987() {
		assertEquals("3750 Guion Rd", customers.get(2986).getAddress());
	}

	@Test
	@DisplayName("Record 2987: City is Indianapolis")
	void CityOfRecord2987() {
		assertEquals("Indianapolis", customers.get(2986).getCity());
	}

	@Test
	@DisplayName("Record 2987: County is Marion")
	void CountyOfRecord2987() {
		assertEquals("Marion", customers.get(2986).getCounty());
	}

	@Test
	@DisplayName("Record 2987: State is IN")
	void StateOfRecord2987() {
		assertEquals("IN", customers.get(2986).getState());
	}

	@Test
	@DisplayName("Record 2987: ZIP is 46222")
	void ZIPOfRecord2987() {
		assertEquals("46222", customers.get(2986).getZIP());
	}

	@Test
	@DisplayName("Record 2987: Phone is 317-924-6238")
	void PhoneOfRecord2987() {
		assertEquals("317-924-6238", customers.get(2986).getPhone());
	}

	@Test
	@DisplayName("Record 2987: Fax is 317-924-1245")
	void FaxOfRecord2987() {
		assertEquals("317-924-1245", customers.get(2986).getFax());
	}

	@Test
	@DisplayName("Record 2987: Email is lizzie@hilser.com")
	void EmailOfRecord2987() {
		assertEquals("lizzie@hilser.com", customers.get(2986).getEmail());
	}

	@Test
	@DisplayName("Record 2987: Web is http://www.lizziehilser.com")
	void WebOfRecord2987() {
		assertEquals("http://www.lizziehilser.com", customers.get(2986).getWeb());
	}
}
