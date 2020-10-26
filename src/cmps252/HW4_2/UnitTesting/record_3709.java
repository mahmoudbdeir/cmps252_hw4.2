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

@Tag("42")
class Record_3709 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3709: FirstName is Esmeralda")
	void FirstNameOfRecord3709() {
		assertEquals("Esmeralda", customers.get(3708).getFirstName());
	}

	@Test
	@DisplayName("Record 3709: LastName is Demler")
	void LastNameOfRecord3709() {
		assertEquals("Demler", customers.get(3708).getLastName());
	}

	@Test
	@DisplayName("Record 3709: Company is Fairfield Chamber Commrce Inc")
	void CompanyOfRecord3709() {
		assertEquals("Fairfield Chamber Commrce Inc", customers.get(3708).getCompany());
	}

	@Test
	@DisplayName("Record 3709: Address is 5841 Thunderbird Rd")
	void AddressOfRecord3709() {
		assertEquals("5841 Thunderbird Rd", customers.get(3708).getAddress());
	}

	@Test
	@DisplayName("Record 3709: City is Indianapolis")
	void CityOfRecord3709() {
		assertEquals("Indianapolis", customers.get(3708).getCity());
	}

	@Test
	@DisplayName("Record 3709: County is Marion")
	void CountyOfRecord3709() {
		assertEquals("Marion", customers.get(3708).getCounty());
	}

	@Test
	@DisplayName("Record 3709: State is IN")
	void StateOfRecord3709() {
		assertEquals("IN", customers.get(3708).getState());
	}

	@Test
	@DisplayName("Record 3709: ZIP is 46236")
	void ZIPOfRecord3709() {
		assertEquals("46236", customers.get(3708).getZIP());
	}

	@Test
	@DisplayName("Record 3709: Phone is 317-823-7524")
	void PhoneOfRecord3709() {
		assertEquals("317-823-7524", customers.get(3708).getPhone());
	}

	@Test
	@DisplayName("Record 3709: Fax is 317-823-4556")
	void FaxOfRecord3709() {
		assertEquals("317-823-4556", customers.get(3708).getFax());
	}

	@Test
	@DisplayName("Record 3709: Email is esmeralda@demler.com")
	void EmailOfRecord3709() {
		assertEquals("esmeralda@demler.com", customers.get(3708).getEmail());
	}

	@Test
	@DisplayName("Record 3709: Web is http://www.esmeraldademler.com")
	void WebOfRecord3709() {
		assertEquals("http://www.esmeraldademler.com", customers.get(3708).getWeb());
	}
}
