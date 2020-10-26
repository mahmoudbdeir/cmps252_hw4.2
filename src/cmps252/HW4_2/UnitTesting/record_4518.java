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

@Tag("37")
class Record_4518 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4518: FirstName is Hugh")
	void FirstNameOfRecord4518() {
		assertEquals("Hugh", customers.get(4517).getFirstName());
	}

	@Test
	@DisplayName("Record 4518: LastName is Butterworth")
	void LastNameOfRecord4518() {
		assertEquals("Butterworth", customers.get(4517).getLastName());
	}

	@Test
	@DisplayName("Record 4518: Company is A Angonoa Inc")
	void CompanyOfRecord4518() {
		assertEquals("A Angonoa Inc", customers.get(4517).getCompany());
	}

	@Test
	@DisplayName("Record 4518: Address is 896 State Road 65")
	void AddressOfRecord4518() {
		assertEquals("896 State Road 65", customers.get(4517).getAddress());
	}

	@Test
	@DisplayName("Record 4518: City is River Falls")
	void CityOfRecord4518() {
		assertEquals("River Falls", customers.get(4517).getCity());
	}

	@Test
	@DisplayName("Record 4518: County is Pierce")
	void CountyOfRecord4518() {
		assertEquals("Pierce", customers.get(4517).getCounty());
	}

	@Test
	@DisplayName("Record 4518: State is WI")
	void StateOfRecord4518() {
		assertEquals("WI", customers.get(4517).getState());
	}

	@Test
	@DisplayName("Record 4518: ZIP is 54022")
	void ZIPOfRecord4518() {
		assertEquals("54022", customers.get(4517).getZIP());
	}

	@Test
	@DisplayName("Record 4518: Phone is 715-425-3573")
	void PhoneOfRecord4518() {
		assertEquals("715-425-3573", customers.get(4517).getPhone());
	}

	@Test
	@DisplayName("Record 4518: Fax is 715-425-0713")
	void FaxOfRecord4518() {
		assertEquals("715-425-0713", customers.get(4517).getFax());
	}

	@Test
	@DisplayName("Record 4518: Email is hugh@butterworth.com")
	void EmailOfRecord4518() {
		assertEquals("hugh@butterworth.com", customers.get(4517).getEmail());
	}

	@Test
	@DisplayName("Record 4518: Web is http://www.hughbutterworth.com")
	void WebOfRecord4518() {
		assertEquals("http://www.hughbutterworth.com", customers.get(4517).getWeb());
	}
}
