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

@Tag("25")
class Record_4467 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4467: FirstName is Delbert")
	void FirstNameOfRecord4467() {
		assertEquals("Delbert", customers.get(4466).getFirstName());
	}

	@Test
	@DisplayName("Record 4467: LastName is Schaack")
	void LastNameOfRecord4467() {
		assertEquals("Schaack", customers.get(4466).getLastName());
	}

	@Test
	@DisplayName("Record 4467: Company is Quigley, Sue")
	void CompanyOfRecord4467() {
		assertEquals("Quigley, Sue", customers.get(4466).getCompany());
	}

	@Test
	@DisplayName("Record 4467: Address is 55 S State Ave  #-3c")
	void AddressOfRecord4467() {
		assertEquals("55 S State Ave  #-3c", customers.get(4466).getAddress());
	}

	@Test
	@DisplayName("Record 4467: City is Indianapolis")
	void CityOfRecord4467() {
		assertEquals("Indianapolis", customers.get(4466).getCity());
	}

	@Test
	@DisplayName("Record 4467: County is Marion")
	void CountyOfRecord4467() {
		assertEquals("Marion", customers.get(4466).getCounty());
	}

	@Test
	@DisplayName("Record 4467: State is IN")
	void StateOfRecord4467() {
		assertEquals("IN", customers.get(4466).getState());
	}

	@Test
	@DisplayName("Record 4467: ZIP is 46201")
	void ZIPOfRecord4467() {
		assertEquals("46201", customers.get(4466).getZIP());
	}

	@Test
	@DisplayName("Record 4467: Phone is 317-263-9511")
	void PhoneOfRecord4467() {
		assertEquals("317-263-9511", customers.get(4466).getPhone());
	}

	@Test
	@DisplayName("Record 4467: Fax is 317-263-8233")
	void FaxOfRecord4467() {
		assertEquals("317-263-8233", customers.get(4466).getFax());
	}

	@Test
	@DisplayName("Record 4467: Email is delbert@schaack.com")
	void EmailOfRecord4467() {
		assertEquals("delbert@schaack.com", customers.get(4466).getEmail());
	}

	@Test
	@DisplayName("Record 4467: Web is http://www.delbertschaack.com")
	void WebOfRecord4467() {
		assertEquals("http://www.delbertschaack.com", customers.get(4466).getWeb());
	}
}
