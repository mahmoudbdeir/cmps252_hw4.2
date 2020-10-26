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

@Tag("34")
class Record_4355 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4355: FirstName is Lois")
	void FirstNameOfRecord4355() {
		assertEquals("Lois", customers.get(4354).getFirstName());
	}

	@Test
	@DisplayName("Record 4355: LastName is Gorczyca")
	void LastNameOfRecord4355() {
		assertEquals("Gorczyca", customers.get(4354).getLastName());
	}

	@Test
	@DisplayName("Record 4355: Company is Horning Chevrolet Inc")
	void CompanyOfRecord4355() {
		assertEquals("Horning Chevrolet Inc", customers.get(4354).getCompany());
	}

	@Test
	@DisplayName("Record 4355: Address is 44 Montgomery St  #-2550")
	void AddressOfRecord4355() {
		assertEquals("44 Montgomery St  #-2550", customers.get(4354).getAddress());
	}

	@Test
	@DisplayName("Record 4355: City is San Francisco")
	void CityOfRecord4355() {
		assertEquals("San Francisco", customers.get(4354).getCity());
	}

	@Test
	@DisplayName("Record 4355: County is San Francisco")
	void CountyOfRecord4355() {
		assertEquals("San Francisco", customers.get(4354).getCounty());
	}

	@Test
	@DisplayName("Record 4355: State is CA")
	void StateOfRecord4355() {
		assertEquals("CA", customers.get(4354).getState());
	}

	@Test
	@DisplayName("Record 4355: ZIP is 94104")
	void ZIPOfRecord4355() {
		assertEquals("94104", customers.get(4354).getZIP());
	}

	@Test
	@DisplayName("Record 4355: Phone is 415-421-0623")
	void PhoneOfRecord4355() {
		assertEquals("415-421-0623", customers.get(4354).getPhone());
	}

	@Test
	@DisplayName("Record 4355: Fax is 415-421-4984")
	void FaxOfRecord4355() {
		assertEquals("415-421-4984", customers.get(4354).getFax());
	}

	@Test
	@DisplayName("Record 4355: Email is lois@gorczyca.com")
	void EmailOfRecord4355() {
		assertEquals("lois@gorczyca.com", customers.get(4354).getEmail());
	}

	@Test
	@DisplayName("Record 4355: Web is http://www.loisgorczyca.com")
	void WebOfRecord4355() {
		assertEquals("http://www.loisgorczyca.com", customers.get(4354).getWeb());
	}
}
