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

@Tag("46")
class Record_4547 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4547: FirstName is Mose")
	void FirstNameOfRecord4547() {
		assertEquals("Mose", customers.get(4546).getFirstName());
	}

	@Test
	@DisplayName("Record 4547: LastName is Frischkorn")
	void LastNameOfRecord4547() {
		assertEquals("Frischkorn", customers.get(4546).getLastName());
	}

	@Test
	@DisplayName("Record 4547: Company is Hymer, David M Esq")
	void CompanyOfRecord4547() {
		assertEquals("Hymer, David M Esq", customers.get(4546).getCompany());
	}

	@Test
	@DisplayName("Record 4547: Address is 8777 Purdue Rd  #-130")
	void AddressOfRecord4547() {
		assertEquals("8777 Purdue Rd  #-130", customers.get(4546).getAddress());
	}

	@Test
	@DisplayName("Record 4547: City is Indianapolis")
	void CityOfRecord4547() {
		assertEquals("Indianapolis", customers.get(4546).getCity());
	}

	@Test
	@DisplayName("Record 4547: County is Marion")
	void CountyOfRecord4547() {
		assertEquals("Marion", customers.get(4546).getCounty());
	}

	@Test
	@DisplayName("Record 4547: State is IN")
	void StateOfRecord4547() {
		assertEquals("IN", customers.get(4546).getState());
	}

	@Test
	@DisplayName("Record 4547: ZIP is 46268")
	void ZIPOfRecord4547() {
		assertEquals("46268", customers.get(4546).getZIP());
	}

	@Test
	@DisplayName("Record 4547: Phone is 317-872-7658")
	void PhoneOfRecord4547() {
		assertEquals("317-872-7658", customers.get(4546).getPhone());
	}

	@Test
	@DisplayName("Record 4547: Fax is 317-872-3851")
	void FaxOfRecord4547() {
		assertEquals("317-872-3851", customers.get(4546).getFax());
	}

	@Test
	@DisplayName("Record 4547: Email is mose@frischkorn.com")
	void EmailOfRecord4547() {
		assertEquals("mose@frischkorn.com", customers.get(4546).getEmail());
	}

	@Test
	@DisplayName("Record 4547: Web is http://www.mosefrischkorn.com")
	void WebOfRecord4547() {
		assertEquals("http://www.mosefrischkorn.com", customers.get(4546).getWeb());
	}
}
