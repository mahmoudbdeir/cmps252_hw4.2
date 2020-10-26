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

@Tag("0")
class Record_3537 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3537: FirstName is Bianca")
	void FirstNameOfRecord3537() {
		assertEquals("Bianca", customers.get(3536).getFirstName());
	}

	@Test
	@DisplayName("Record 3537: LastName is Crigler")
	void LastNameOfRecord3537() {
		assertEquals("Crigler", customers.get(3536).getLastName());
	}

	@Test
	@DisplayName("Record 3537: Company is Morris, David A Esq")
	void CompanyOfRecord3537() {
		assertEquals("Morris, David A Esq", customers.get(3536).getCompany());
	}

	@Test
	@DisplayName("Record 3537: Address is 16 N 26th St")
	void AddressOfRecord3537() {
		assertEquals("16 N 26th St", customers.get(3536).getAddress());
	}

	@Test
	@DisplayName("Record 3537: City is Kenilworth")
	void CityOfRecord3537() {
		assertEquals("Kenilworth", customers.get(3536).getCity());
	}

	@Test
	@DisplayName("Record 3537: County is Union")
	void CountyOfRecord3537() {
		assertEquals("Union", customers.get(3536).getCounty());
	}

	@Test
	@DisplayName("Record 3537: State is NJ")
	void StateOfRecord3537() {
		assertEquals("NJ", customers.get(3536).getState());
	}

	@Test
	@DisplayName("Record 3537: ZIP is 7033")
	void ZIPOfRecord3537() {
		assertEquals("7033", customers.get(3536).getZIP());
	}

	@Test
	@DisplayName("Record 3537: Phone is 908-241-9956")
	void PhoneOfRecord3537() {
		assertEquals("908-241-9956", customers.get(3536).getPhone());
	}

	@Test
	@DisplayName("Record 3537: Fax is 908-241-8475")
	void FaxOfRecord3537() {
		assertEquals("908-241-8475", customers.get(3536).getFax());
	}

	@Test
	@DisplayName("Record 3537: Email is bianca@crigler.com")
	void EmailOfRecord3537() {
		assertEquals("bianca@crigler.com", customers.get(3536).getEmail());
	}

	@Test
	@DisplayName("Record 3537: Web is http://www.biancacrigler.com")
	void WebOfRecord3537() {
		assertEquals("http://www.biancacrigler.com", customers.get(3536).getWeb());
	}
}
